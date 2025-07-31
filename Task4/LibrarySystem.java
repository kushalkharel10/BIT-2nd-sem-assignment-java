import java.util.*;

class Book {
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // 1. ArrayList for all books
        List<Book> allBooks = new ArrayList<>();
        allBooks.add(new Book("1984", "George Orwell"));
        allBooks.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        
        // 2. HashSet for borrowed books (unique titles)
        Set<String> borrowedBooks = new HashSet<>();
        borrowedBooks.add("1984");
        
        // 3. Map to track members and their books
        Map<Integer, List<Book>> memberRecords = new HashMap<>();
        memberRecords.put(101, Arrays.asList(allBooks.get(0)));
        
        // Display using enhanced for loop
        System.out.println("=== All Books ===");
        for (Book book : allBooks) {
            System.out.println(book);
        }
        
        // Display using Iterator
        System.out.println("\n=== Borrowed Books ===");
        Iterator<String> it = borrowedBooks.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        // Wildcard example: Method to process any List of Books
        printBookList(allBooks);
    }
    
    // Generic method with wildcard
    public static void printBookList(List<? extends Book> books) {
        System.out.println("\n=== Library Catalog ===");
        books.forEach(b -> System.out.println(b));
    }
}

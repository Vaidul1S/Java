public class Main31_aggregation {

    public static void main(String[] args) {

        // Aggregation = Represents a relationship between objects

        Book book1 = new Book("A Game of Thrones", 638);
        Book book2 = new Book("A Clash of Kings", 756);
        Book book3 = new Book("A Feast for Crows", 728);

        Book[] books = {book1, book2, book3};

        for (Book book : books){
            System.out.println(book.displayInfo());
        }

        Library library = new Library("National", 1650, books);

        library.displayInfo();


    }



}

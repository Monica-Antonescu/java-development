package src.main.java.homework2;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Hamlet", 531));
        library.addBook(new Book("Crime and Punishment", 249));
        library.addBook(new Book("Madame Bovary", 187));

        library.addBook(new Novel("Pride and Prejudice", 603, "Romantic"));
        library.addBook(new Novel("A Game of Thrones", 865, "Fantasy"));

        library.addBook(new ArtAlbum("Art Album 2019", 28, "Recycled paper"));
        library.addBook(new ArtAlbum("Art Album 2020", 34, "Bond paper"));
        library.listBooks();

        //Print all books remained after removal
        System.out.println("List library after books deleted");
        library.deleteBook(1);
        library.deleteBook(4);
        library.listBooks();
    }
}

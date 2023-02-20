/*
Write an application named BookArray in which you create an array that holds 10 Books, some Fiction and some NonFiction.
Using a for loop, display details about all 10 books. Save the file as BookArray.java.
 */
/******************************************************************************
 Programmer: Nicholas Foley
 Date: 02/20/2023
 Lab 11
 Instructor: Dr. Rafael Azuaje
 College: Northeast Lakeview
 *******************************************************************************/
public class BookArray {
    public static void main(String[] args) {
        //Create an array of 10 Books
        var books = new Book[10]; 
        
        //Populate the array with 10 books 
        books[0] = new Book("Harry Potter", "Fiction");
        books[1] = new Book("A Brief History of Time", "Non-Fiction"); 
        books[2] = new Book("The Grapes of Wrath", "Fiction"); 
        books[3] = new Book("The Hitchhiker's Guide to the Galaxy", "Fiction"); 
        books[4] = new Book("Gödel, Escher, Bach", "Non-Fiction"); 
        books[5] = new Book("The Catcher in the Rye", "Fiction"); 
        books[6] = new Book("Elements of Style", "Non-Fiction"); 
        books[7] = new Book("To Kill a Mockingbird", "Fiction"); 
        books[8] = new Book("The Prince", "Non-Fiction");
        books[9] = new Book("Animal Farm", "Fiction");
 
        //Iterate over books array and display details about each book 
        for(int i=0; i<books.length; i++) {
            System.out.println(books[i].toString());  
        }
    }
}

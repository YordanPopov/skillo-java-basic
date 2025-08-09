import java.util.Scanner;
import java.util.Stack;

public class BooksManager {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Stack<String> books = new Stack<>();

        while (true) {
            System.out.println("\n---- BOOK LIST ----");
            System.out.println("1. Add Book");
            System.out.println("2. View top book");
            System.out.println("3. Remove book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = userInput.nextInt();
            userInput.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bookTitle = userInput.nextLine();
                    books.add(bookTitle);
                    System.out.println("Book added!");
                    break;

                case 2:
                    String topBook = books.peek();
                    System.out.println("The top book in a stack is: " + topBook);
                    break;

                case 3:
                    if (books.isEmpty()) {
                        System.out.println("No books yet.");
                    } else {
                        System.out.print("Enter a number of book for removing: ");
                        int bookIndex = userInput.nextInt();
                        books.remove(bookIndex - 1);
                        System.out.println("Book is removed!");
                    }
                    break;

                case 4:
                    System.out.println("GOODBYE!!!");
                    userInput.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
    }
}

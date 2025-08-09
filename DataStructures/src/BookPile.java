import java.util.Scanner;
import java.util.Stack;

public class BookPile {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Stack<String> bookStack = new Stack<>();

        bookStack.push("The Hobbit");
        bookStack.push("1984");
        bookStack.push("Harry Potter");
        bookStack.push("The Catcher in the Rye");
        bookStack.push("Pride and Prejudice");

        while (true) {
            System.out.println("\n--- BOOK STACK MENU ---");
            System.out.println("1. Add Book to Stack");
            System.out.println("2. Search and Retrieve Book by Title");
            System.out.println("3. View Books in Stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = userInput.nextInt();
            userInput.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String newBook = userInput.nextLine();
                    bookStack.push(newBook);
                    System.out.println("Book \"" + newBook + "\" added to stack.");
                    break;

                case 2:
                    if (bookStack.isEmpty()) {
                        System.out.println("The stack is empty.");
                        break;
                    }
                    System.out.print("Enter book title to search: ");
                    String searchTitle = userInput.nextLine();

                    if (bookStack.contains(searchTitle)) {
                        Stack<String> tempStack = new Stack<>();

                        while (!bookStack.isEmpty()) {
                            String topBook = bookStack.pop();
                            if (topBook.equalsIgnoreCase(searchTitle)) {
                                System.out.println("Retrieved: \"" + topBook + "\"");
                                break;
                            } else {
                                tempStack.push(topBook);
                            }
                        }

                        while (!tempStack.isEmpty()) {
                            bookStack.push(tempStack.pop());
                        }
                    } else {
                        System.out.println("Book not found in stack.");
                    }
                    break;

                case 3:
                    if (bookStack.isEmpty()) {
                        System.out.println("No books in the stack.");
                    } else {
                        System.out.println("Books in stack (top first):");
                        for (int i = bookStack.size() - 1; i >= 0; i--) {
                            System.out.println(bookStack.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    userInput.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

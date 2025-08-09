import java.util.LinkedList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class ContactList {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        LinkedList<String> contactsList = new LinkedList<>();

        while (true) {
            System.out.println("\n---- CONTACT LIST ----");
            System.out.println("1. Add contact");
            System.out.println("2. View contact list");
            System.out.println("3. Remove contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = userInput.nextInt();
            userInput.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter a contact: ");
                    String contact = userInput.nextLine();
                    contactsList.add(contact);
                    System.out.println("Contact added!");
                    break;

                case 2:
                    if (contactsList.isEmpty()) {
                        System.out.println("No contacts yet!");
                    } else {
                        System.out.println("Contact list: " + contactsList);
                    }
                    break;

                case 3:
                    if (contactsList.isEmpty()) {
                        System.out.println("Contacts list is empty.");
                    } else {
                        System.out.print("Enter contact to remove: ");
                        String contactToBeRemoved = userInput.nextLine();

                        if (contactsList.contains(contactToBeRemoved)) {
                            contactsList.remove(contactToBeRemoved);
                            System.out.println("Contact is successfully removed.");
                        } else {
                            System.out.println("Non-existent contact.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("GOODBYE!!!");
                    userInput.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

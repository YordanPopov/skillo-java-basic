import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> isCompleted = new ArrayList<>();

        while (true) {
            System.out.println("----To-Do List----");
            System.out.println("1.Add task.");
            System.out.println("2.Mark task as completed.");
            System.out.println("3.Remove completed task.");
            System.out.println("4.Show task list.");
            System.out.println("5.Exit.");
            System.out.print("Enter your choice: ");

            int choice = userInput.nextInt();
            userInput.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = userInput.nextLine();
                    tasks.add(task);
                    isCompleted.add(false);

                    System.out.println("Task is added successfully!");
                    break;

                case 2: break;
                case 3: break;
                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("Task list is empty!");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            String status = isCompleted.get(i) ? "[Completed]" : "[not-completed]";
                            System.out.println(tasks.get(i) + "-->" + status);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Bye Bye!!!");
                    userInput.close();
                    return;
            }
        }
    }
}

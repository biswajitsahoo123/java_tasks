import java.util.ArrayList;
import java.util.Scanner;
public class to_do_list {
        public static void main(String[]args){
            ArrayList<String> tasks = new ArrayList<>();
            Scanner sc= new Scanner(System.in);
            boolean isRunning = true;

            while (isRunning) {
                System.out.println("1. Add Task");
                System.out.println("2. View Tasks");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter task: ");
                        sc.nextLine(); // Consume newline character
                        String task = sc.nextLine();
                        tasks.add(task);
                        System.out.println("Task added successfully!");
                        break;
                    case 2:
                        if (tasks.isEmpty()) {
                            System.out.println("No tasks added yet.");
                        } else {
                            System.out.println("Tasks:");
                            for (int i = 0; i < tasks.size(); i++) {
                                System.out.println((i + 1) + ". " + tasks.get(i));
                            }
                        }
                        break;
                    case 3:
                        isRunning = false;
                        System.out.println("Exiting program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
            sc.close();
        }
}

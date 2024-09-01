package task3;

import java.util.Scanner;

public class TaskController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaskService taskService = new TaskService();

        boolean running = true;
        while (running) {
            System.out.println("1. Create Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your option: ");

            int choice = input.nextInt();

        }

    }
}

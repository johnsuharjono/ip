import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String command;
        Scanner in = new Scanner(System.in);

        System.out.println("____________________________________________________________");
        System.out.println("Hello I'm Duke");
        System.out.println("What can I do for you?");
        System.out.println("____________________________________________________________");

        command = in.nextLine();

        while (!command.equals("bye")) {
            System.out.println("____________________________________________________________");
            System.out.println(command);
            System.out.println("____________________________________________________________");
            command = in.nextLine();
        }

        System.out.println("____________________________________________________________");
        System.out.println("Bye, Hope to see you again soon!");
        System.out.println("____________________________________________________________");
    }
}

import java.util.Scanner;

class HelloYou {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("Hello" + name + "!");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scn.next();
        System.out.println("Hello " + name);
    }
}

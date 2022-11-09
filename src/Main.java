import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> names = new ArrayList<>();
    static Scanner scn = new Scanner(System.in);


    public static void fillList(){
        System.out.println("Enter number of people:");
        int numPeople = scn.nextInt();
        for (int i = 0; i < numPeople; i++) {
            System.out.println("Enter name " + i + " :");
            String name = scn.nextLine();
            names.add(name);
        }
    }

    public static void printList(){

    }

    public static void getNumPeople(){
        
    }


    public static void main(String[] args) {
        //System.out.println("Hello world");
        System.out.println("Please enter your name: ");
        String name = scn.next();
        System.out.println("Hello " + name);
    }
}

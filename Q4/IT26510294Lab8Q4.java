import java.util.Scanner;

public class IT26510294Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Enter Student ID: ");
            int id = input.nextInt();

            if (id <= 0) {
                System.out.println("Error! Enter a valid Student ID.");
                i--;
            } else {
                studentsArray[i] = id;
            }
        }

        System.out.print("Enter Student ID to search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchID) {
                found = true;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
    }
}





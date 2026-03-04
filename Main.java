import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        Studentdetails[] S = new Studentdetails[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of student " + (i + 1));

            System.out.println("Enter student name:");
            String name = sc.nextLine();

            System.out.println("Enter school name:");
            String school = sc.nextLine();

            System.out.println("Enter language:");
            String language = sc.nextLine();

            System.out.println("Enter age:");
            int age = sc.nextInt();

            System.out.println("Enter Maths mark:");
            int math = sc.nextInt();

            System.out.println("Enter Physics mark:");
            int phy = sc.nextInt();

            System.out.println("Enter Chemistry mark:");
            int chem = sc.nextInt();
            sc.nextLine();

            S[i] = new Studentdetails(name, school, language, age, math, phy, chem);
        }

        System.out.println("\nStudent Details\n");

        for (int i = 0; i < n; i++) {
            S[i].display();
        }

        sc.close();
    }
}
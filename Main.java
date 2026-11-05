import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Information");
            System.out.println("5. Delete Student Record");
            System.out.println("6. Display Student Details");
            System.out.println("7. Calculate CGPA");
            System.out.println("8. Exit System");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter CGPA: ");
                double cgpa = sc.nextDouble();
                manager.addStudent(new Student(id, name, cgpa));
            } else if (choice == 2) {
                manager.viewAllStudents();
            } else if (choice == 3) {
                System.out.print("Enter ID to Search: ");
                int id = sc.nextInt();
                manager.searchById(id);
            } else if (choice == 4) {
                System.out.print("Enter ID to Update: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter New Name: ");
                String name = sc.nextLine();
                System.out.print("Enter New CGPA: ");
                double cgpa = sc.nextDouble();
                manager.updateStudent(id, name, cgpa);
            } else if (choice == 5) {
                System.out.print("Enter ID to Delete: ");
                int id = sc.nextInt();
                manager.deleteStudent(id);
            } else if (choice == 6) {
                System.out.print("Enter ID to Display Details: ");
                int id = sc.nextInt();
                manager.displayStudentDetails(id);
            } else if (choice == 7) {
                manager.calculateCGPA();
            } else if (choice == 8) {
                System.out.println("Exiting System... Thank You!");
                break;
            } else {
                System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}
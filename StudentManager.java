import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added Successfully!");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No Students Found!");
        } else {
            for (Student s : students) {
                s.display();
            }
        }
    }

    public void searchById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.display();
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    public void updateStudent(int id, String name, double cgpa) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name);
                s.setCgpa(cgpa);
                System.out.println("Student Updated Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    public void displayStudentDetails(int id) {
        System.out.println("--- Student Details ---");
        searchById(id);
    }

    public void calculateCGPA() {
        if (students.isEmpty()) {
            System.out.println("No Students Found!");
            return;
        }
        double total = 0;
        double highest = students.get(0).getCgpa();
        double lowest = students.get(0).getCgpa();
        for (Student s : students) {
            total += s.getCgpa();
            if (s.getCgpa() > highest) highest = s.getCgpa();
            if (s.getCgpa() < lowest) lowest = s.getCgpa();
        }
        double avg = total / students.size();
        System.out.println("Total Students: " + students.size());
        System.out.println("Average CGPA: " + avg);
        System.out.println("Highest CGPA: " + highest);
        System.out.println("Lowest CGPA: " + lowest);
    }
}
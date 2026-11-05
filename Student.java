public class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getCgpa() { return cgpa; }

    public void setName(String name) { this.name = name; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | CGPA: " + cgpa);
    }
}
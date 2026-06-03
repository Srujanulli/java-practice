package Day_1;

public class Student {
    private String name;
    private String grade;
    private double gpa;

    public Student(String name, String grade, double gpa) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }

    public void displayInfo(){
        System.out.println("Name:" + name);
        System.out.println("Grade:" + grade);
        System.out.println("GPA: " + gpa);
    }

    public void setGPA(double gpa){
        if (gpa>0 && gpa<=10) {
            this.gpa = gpa;
        }
    }

    public double getGPA(){
        return gpa;
    }

    public static void main(String[] args) {
        Student s = new Student("Raj","A",8.9);
        s.displayInfo();
        double studentGPA= s.getGPA();
        System.out.println(studentGPA);
    }
}

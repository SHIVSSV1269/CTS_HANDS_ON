// StudentView.java - View
public class StudentView {
    public void displayStudentDetails(String id, String name, String grade) {
        System.out.println("+--------------------------+");
        System.out.println("|   Student Record         |");
        System.out.println("+--------------------------+");
        System.out.println("| ID    : " + id);
        System.out.println("| Name  : " + name);
        System.out.println("| Grade : " + grade);
        System.out.println("+--------------------------+");
    }
}

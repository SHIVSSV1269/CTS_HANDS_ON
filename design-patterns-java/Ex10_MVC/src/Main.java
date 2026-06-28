public class Main {
    public static void main(String[] args) {
        System.out.println("=== MVC Pattern Demo ===\n");

        // Create Model
        Student student = new Student("S101", "Ravi Kumar", "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller linking Model and View
        StudentController controller = new StudentController(student, view);

        System.out.println("-- Initial Student Record --");
        controller.updateView();

        // Update model via controller
        System.out.println("\n-- Updating name and grade via Controller --");
        controller.setStudentName("Ravi Kumar Sharma");
        controller.setStudentGrade("A+");

        System.out.println("\n-- Updated Student Record --");
        controller.updateView();

        // Add another student
        System.out.println("\n-- Another Student --");
        Student student2 = new Student("S102", "Priya Sharma", "B+");
        StudentController controller2 = new StudentController(student2, view);
        controller2.updateView();
    }
}

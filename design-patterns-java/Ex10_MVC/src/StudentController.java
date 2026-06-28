// StudentController.java - Controller
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view  = view;
    }

    // Getters delegate to model
    public String getStudentId()    { return model.getId(); }
    public String getStudentName()  { return model.getName(); }
    public String getStudentGrade() { return model.getGrade(); }

    // Setters update the model
    public void setStudentId(String id)       { model.setId(id); }
    public void setStudentName(String name)   { model.setName(name); }
    public void setStudentGrade(String grade) { model.setGrade(grade); }

    // Updates the view with current model data
    public void updateView() {
        view.displayStudentDetails(model.getId(), model.getName(), model.getGrade());
    }
}

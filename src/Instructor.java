import java.util.List;

public class Instructor extends User {

    private List<Course> coursesTeaching;
    private String teachingLanguage;

    public Instructor(String name, String email, String biography,
                      List<Course> coursesTeaching, String teachingLanguage) {
        super(name, email, biography);
        this.coursesTeaching = coursesTeaching;
        this.teachingLanguage = teachingLanguage;
    }

    public void createCourse() {}

    public void deleteCourse(String course) {}
}

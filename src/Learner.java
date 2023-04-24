import java.util.List;

public class Learner extends User {

    private List<Course> coursesEnrolled;
    private int weeklyGoal;

    public Learner(String name, String email, String biography,
                   List<Course> coursesEnrolled, int weeklyGoal) {
        super(name, email, biography);
        this.coursesEnrolled = coursesEnrolled;
        this.weeklyGoal = weeklyGoal;
    }

    public void enrolInCourse(String courseID) {}

    public void updateGoals() {}
}

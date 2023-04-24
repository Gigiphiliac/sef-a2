import java.time.LocalDate;
import java.util.List;

public class Course {

    private String courseID;
    private String topic;
    private Instructor instructor;
    private LocalDate date;
    private double duration;
    private List<Lesson> lessons;

    public Course(String courseID, String topic, Instructor instructor,
                  LocalDate date, double duration, List<Lesson> lessons) {
        this.courseID = courseID;
        this.topic = topic;
        this.instructor = instructor;
        this.date = date;
        this.duration = duration;
        this.lessons = lessons;
    }

    public void updateCourse() {}

    public void addLesson(Lesson lesson) {}

    public void removeLesson(String lessonID) {}
}

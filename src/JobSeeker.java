import java.util.List;

public class JobSeeker extends User {

    private Resume resume;
    private List<JobApplication> applicationsSubmitted;

    public JobSeeker(String name, String email, String biography, Resume resume,
                     List<JobApplication> applicationsSubmitted) {
        super(name, email, biography);
        this.resume = resume;
        this.applicationsSubmitted = applicationsSubmitted;
    }

    public void createResume() {
        // this.resume = new Resume();
    }

    public void submitApplication(JobListing listing,
                                  JobApplication application) {}
}

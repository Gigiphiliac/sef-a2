import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JobListing {

    private Job job;
    private LocalDate date;
    private String requirement;
    private Recruiter managingRecruiter;
    private List<JobApplication> applications;

    public JobListing(Job job, LocalDate date, String requirement,
                      Recruiter managingRecruiter) {
        this.job = job;
        this.date = date;
        this.requirement = requirement;
        this.managingRecruiter = managingRecruiter;
        this.applications = new ArrayList<>();
    }

    public void updateJobListing() {}

    public int calculateTotalApplications() {
        return applications.size();
    }
}

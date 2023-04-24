import java.util.List;

public class Recruiter extends User {

    private List<JobListing> managedListings;
    private String telephone;

    public Recruiter(String name, String email, String biography,
                     List<JobListing> managedListings, String telephone) {
        super(name, email, biography);
        this.managedListings = managedListings;
        this.telephone = telephone;
    }

    public void createJobListing(JobListing jobListing) {}

    public void closeJobListing(String jobID) {}
}

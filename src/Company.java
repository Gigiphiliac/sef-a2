import java.util.List;

public class Company {

    private String name;
    private String location;
    private String description;
    private List<Recruiter> recruiters;
    private List<Job> jobs;

    public Company(String name, String location, String description,
                   List<Recruiter> recruiters, List<Job> jobs) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.recruiters = recruiters;
        this.jobs = jobs;
    }

    public void updateCompany() {}

    public void addRecruiter(String email) {}
}

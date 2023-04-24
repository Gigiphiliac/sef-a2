public class Job {

    private String jobID;
    private String jobTitle;
    private String jobType;
    private String jobDescription;
    private String location;
    private Company company;

    public Job(String jobID, String jobTitle, String jobType,
               String jobDescription, String location, Company company) {
        this.jobID = jobID;
        this.jobTitle = jobTitle;
        this.jobType = jobType;
        this.jobDescription = jobDescription;
        this.location = location;
        this.company = company;
    }

    public void updateJob() {}

//    public void ___() {}
}

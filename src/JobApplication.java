public class JobApplication {

    private String applicantID;
    private Resume applicantResume;
    private boolean status;

    public JobApplication(String applicantID, Resume applicantResume) {
        this.applicantID = applicantID;
        this.applicantResume = applicantResume;
        this.status = false;
    }

    public void updateJobApplication() {}

    public void toggleStatus() {
        this.status = !this.status;
    }
}

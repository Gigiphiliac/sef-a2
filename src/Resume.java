import java.util.HashMap;
import java.util.List;

public class Resume {

    private HashMap<String, Double> pastExperienceAndDuration;
    private List<String> skills;
    private List<String> traits;
    private String highestEducationLevel;

    public Resume(HashMap<String, Double> pastExperienceAndDuration,
                  List<String> skills, List<String> traits,
                  String highestEducationLevel) {
        this.pastExperienceAndDuration = pastExperienceAndDuration;
        this.skills = skills;
        this.traits = traits;
        this.highestEducationLevel = highestEducationLevel;
    }

    public void updateResume() {}

//     public void __() {}
}

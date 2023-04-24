public class User {

    protected String name;
    protected String email;
    protected String biography;

    public User(String name, String email, String biography) {
        this.name = name;
        this.email = email;
        this.biography = biography;
    }

    public void sendMessage(String message, User target) {}

    public void updatePersonalInformation() {}
}

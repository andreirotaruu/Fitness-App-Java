public class User {
    private String name;
    private int age;
    private String username;
    private String password;
    private int goalWeight;
    private String goalBodyType;
    
    public User(String username, String password, int goalWeight, String goalBodyType) {
        this.username = username;
        this.password = password;
        this.goalWeight = goalWeight;
        this.goalBodyType = goalBodyType;
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
        goalWeight = 0;
        goalBodyType = "none";
    }

    public User(){
        this.name = "none";
        this.age = 0;
        this.username = "none";
        this.password = "none";
        this.goalWeight = 0;
        this.goalBodyType = "none";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGoalWeight() {
        return goalWeight;
    }

    public void setGoalWeight(int goalWeight) {
        this.goalWeight = goalWeight;
    }

    public String getGoalBodyType() {
        return goalBodyType;
    }

    public void setGoalBodyType(String goalBodyType) {
        this.goalBodyType = goalBodyType;
    }

    

}

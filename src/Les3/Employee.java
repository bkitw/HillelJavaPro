package Les3;

public class Employee {
    private String name;
    private String jobTitle;
    private String email;
    private String number;
    private int age;

    public Employee(String name, String jobTitle, String email, String number, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.number = number;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }
}

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public String getHometown() {
        return hometown;
    }

    private String hometown;

    public Student(String firstName, String lastName, int age, String hometown){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return STR."\{this.firstName} \{this.lastName} is \{this.age} years old.";
    }
}

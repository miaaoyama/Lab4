// A class for adding a student, but is absolutely non-functional
public class AddAStudent {
    String name;
    int age;
    int id;

    // No-args constructor
    AddAStudent() {}

    // Constructor with name parameter
    AddAStudent(String name) {
        this.name = name;
    }

    // Constructor with name and age parameter
    AddAStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with all parameters
    AddAStudent(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getter methods-------------------------------------------
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getId() {
        return this.id;
    }

    // Setter methods---------------------------------------------
    public void setName (String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package Queue_Demerging;

public class Employee {
    private String name;
    private int age;
    private boolean Gender;

    public Employee(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        Gender = gender;
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

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean gender) {
        Gender = gender;
    }
}

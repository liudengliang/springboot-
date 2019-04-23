package springboot2.demo.entity;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Integer grade;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Student() {
    }

    public Student(Integer id, String name, Integer age, Integer grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

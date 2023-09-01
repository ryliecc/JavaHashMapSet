import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    public String firstName;
    public String lastName;
    public int matrikelNumber;
    List<Course> courses = new ArrayList<>();

    public Student(String firstName, String lastName, int matrikelNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matrikelNumber = matrikelNumber;
    }

    public Student(String firstName, String lastName, int matrikelNumber, List<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matrikelNumber = matrikelNumber;
        this.courses = courses;
    }

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMatrikelNumber() {
        return matrikelNumber;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMatrikelNumber(int matrikelNumber) {
        this.matrikelNumber = matrikelNumber;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", matrikelNumber=" + matrikelNumber +
                ", courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matrikelNumber == student.matrikelNumber && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, matrikelNumber, courses);
    }

    public void addCourse(Course course){
        courses.add(course);
    }
}

import java.util.ArrayList;
import java.util.List;

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

    public void addCourse(Course course){
        courses.add(course);
    }
}

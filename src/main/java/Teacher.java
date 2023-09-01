import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Teacher {
    String title;
    String lastName;
    Map<String, Course> courses = new HashMap<>();
    int socialSecurityNumber;

    public Teacher(String title, String lastName, Map<String, Course> courses, int socialSecurityNumber) {
        this.title = title;
        this.lastName = lastName;
        this.courses = courses;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Teacher(String title, String lastName, int socialSecurityNumber) {
        this.title = title;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getLastName() {
        return lastName;
    }

    public Map<String, Course> getCourses() {
        return courses;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCourses(Map<String, Course> courses) {
        this.courses = courses;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return socialSecurityNumber == teacher.socialSecurityNumber && Objects.equals(title, teacher.title) && Objects.equals(lastName, teacher.lastName) && Objects.equals(courses, teacher.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, lastName, courses, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "title='" + title + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses=" + courses +
                ", socialSecurityNumber=" + socialSecurityNumber +
                '}';
    }

    public void addCourse(Course course){
        courses.put(course.courseName, course);
    }
}

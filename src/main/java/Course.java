import java.util.Objects;

public class Course {
    public String courseName;
    public Teacher professor;
    public int roomNumber;

    public Course(String courseName, Teacher professor, int roomNumber) {
        this.courseName = courseName;
        this.professor = professor;
        this.roomNumber = roomNumber;
    }

    public Course(){

    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getProfessor() {
        return professor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setProfessor(Teacher professor) {
        this.professor = professor;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", professor='" + professor + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return roomNumber == course.roomNumber && Objects.equals(courseName, course.courseName) && Objects.equals(professor, course.professor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, professor, roomNumber);
    }
}

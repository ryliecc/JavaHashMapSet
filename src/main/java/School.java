import java.util.Map;
import java.util.Objects;

public class School {
    Map<Integer, Student> studentsOfPunk;
    Map<Integer, Teacher> teachersOfPunk;
    Map<String, Course> coursesOfPunk;

    public Map<Integer, Student> getStudentsOfPunk() {
        return studentsOfPunk;
    }

    public Map<Integer, Teacher> getTeachersOfPunk() {
        return teachersOfPunk;
    }

    public Map<String, Course> getCoursesOfPunk() {
        return coursesOfPunk;
    }

    public void setStudentsOfPunk(Map<Integer, Student> studentsOfPunk) {
        this.studentsOfPunk = studentsOfPunk;
    }

    public void setTeachersOfPunk(Map<Integer, Teacher> teachersOfPunk) {
        this.teachersOfPunk = teachersOfPunk;
    }

    public void setCoursesOfPunk(Map<String, Course> coursesOfPunk) {
        this.coursesOfPunk = coursesOfPunk;
    }

    public School(Map<Integer, Student> studentsOfPunk) {
        this.studentsOfPunk = studentsOfPunk;
    }

    public School(Map<Integer, Student> studentsOfPunk, Map<Integer, Teacher> teachersOfPunk, Map<String, Course> coursesOfPunk) {
        this.studentsOfPunk = studentsOfPunk;
        this.teachersOfPunk = teachersOfPunk;
        this.coursesOfPunk = coursesOfPunk;
    }

    public School() {
    }


    public void addStudent(Student student){
        studentsOfPunk.put(student.matrikelNumber, student);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(studentsOfPunk, school.studentsOfPunk) && Objects.equals(teachersOfPunk, school.teachersOfPunk) && Objects.equals(coursesOfPunk, school.coursesOfPunk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentsOfPunk, teachersOfPunk, coursesOfPunk);
    }

    @Override
    public String toString() {
        return "School{" +
                "studentsOfPunk=" + studentsOfPunk +
                ", teachersOfPunk=" + teachersOfPunk +
                ", coursesOfPunk=" + coursesOfPunk +
                '}';
    }

    public Student findStudent(int matrikelNumber){
        Student current = new Student();
        int schoolSize = studentsOfPunk.size();

        for(int i = 0; i < schoolSize; i++){
            current = studentsOfPunk.get(i);
            if(current.matrikelNumber == matrikelNumber){
                return current;
            }
        }
        return current;
    }

    public void removeStudent(int matrikelNumber){
        Student current = new Student();
        int schoolSize = studentsOfPunk.size();

        for(int i = 0; i < schoolSize; i++){
            current = studentsOfPunk.get(i);
            if(current.matrikelNumber == matrikelNumber){
                studentsOfPunk.remove(current);
            }
        }
    }
}

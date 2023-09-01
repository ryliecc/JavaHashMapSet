import java.util.List;

public class School {
    List<Student> studentsOfPunk;

    public List<Student> getStudentsOfPunk() {
        return studentsOfPunk;
    }

    public void setStudentsOfPunk(List<Student> studentsOfPunk) {
        this.studentsOfPunk = studentsOfPunk;
    }

    public School(List<Student> studentsOfPunk) {
        this.studentsOfPunk = studentsOfPunk;
    }

    public void addStudent(Student student){
        studentsOfPunk.add(student);
    }

    @Override
    public String toString() {
        return "School{" +
                "studentsOfPunk=" + studentsOfPunk +
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

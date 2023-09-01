import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student angie = new Student("Angela", "Merkel", 161);
        Student daddy = new Student("Gregor", "Gysi", 1312);
        Student lilOldie = new Student("Philipp", "Amthor", 420);

        Teacher artTeacher = new Teacher("Mrs", "Roth", 23187123);
        Teacher parodyTeacher = new Teacher("Mr", "Sonneborn", 328671837);

        Course uselessDebates = new Course("Useless Debates 101", parodyTeacher, 42);
        Course art = new Course("Paint beautiful rally posters", artTeacher, 666);

        artTeacher.addCourse(art);

        Map<Integer, Student> students = new HashMap<>();
        students.put(angie.matrikelNumber, angie);
        students.put(daddy.matrikelNumber, daddy);
        students.put(lilOldie.matrikelNumber, lilOldie);

        System.out.println(students);

        Map<Integer, Teacher> teachers = new HashMap<>();
        teachers.put(artTeacher.socialSecurityNumber, artTeacher);
        teachers.put(parodyTeacher.socialSecurityNumber, parodyTeacher);

        Map<String, Course> allCourses = new HashMap<>();
        allCourses.put(uselessDebates.courseName, uselessDebates);
        allCourses.put(art.courseName, art);

        School schoolOfSwag = new School(students, teachers, allCourses);

        System.out.println(schoolOfSwag);


        System.out.println(allCourses);

        Map<String, Course> daddysCourses = new HashMap<>();
        daddysCourses.put(art.courseName, art);
        daddy.addCourse(art);

        System.out.println(daddy);
        System.out.println(schoolOfSwag);


    }
}

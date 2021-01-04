package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Александр");
        Teacher teacher = new Teacher("Сергей", "Труд");
        teacher.evaluate(student);
    }
}

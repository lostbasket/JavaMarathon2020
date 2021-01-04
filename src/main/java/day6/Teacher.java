package day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student p) {
        p.getName();
        Random rand = new Random();
        int a = 2 + (int) (Math.random() * 4);
        String rating = null;
        if (a == 2) {
            rating = "неудовлетворительно";
        } else if (a == 3) {
            rating = "удовлетворительно";
        }
        else if (a==4){
            rating = "хорошо";
        }
        else if (a==5){
            rating = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + p.getName() + " по предмету " + subject + " на оценку " + rating);
    }
}

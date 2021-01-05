package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Boeing", 2010, 73, 162);
        Airplane airplane2 = new Airplane("Boeing", 2020, 80, 162);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
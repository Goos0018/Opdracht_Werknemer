package be.vdab;

public class TestWerknemer {
    public static void main(String[] args) {
        Werknemer[] werknemers = {
                new Arbeider ("Jos", 57082332149L, 38),
                new Arbeider ("Els", 61030350468L, 40),
                new Bediende ("Erik", 54110774131L, 1.6)
        };

        for (int i = 0; i < 3; i++) {
            System.out.println(werknemers[i].toString());
        }

        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum =  sum + werknemers[i].getLoon();
        }
        System.out.println("Som lonen: " + sum);
    }
}

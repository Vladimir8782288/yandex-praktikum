package acquaintance;

import org.junit.jupiter.api.Test;

public class Lesson9 {
    @Test
    void test() {
        double rubles = 15000.0;
        double rateUSD = 78.5;
        double dollars = rubles / rateUSD;

        System.out.println("С текущим курсом вы можете купить"
                + " " + dollars + " " + "долларов.");// Напечатайте значение в долларах
    }
}

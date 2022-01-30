package acquaintance;

import org.junit.jupiter.api.Test;

public class Lesson7 {
    @Test
    void test() {
        double rubles = 31400.0;
        double rateUSD = 78.5;
        double dollars = rubles / rateUSD;

        System.out.println(dollars); // Напечатайте значение переменной dollars
    }
}

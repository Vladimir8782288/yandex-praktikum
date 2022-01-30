package acquaintance;

import org.junit.jupiter.api.Test;

public class Lesson12 {
    @Test
    void test() {
        double rubles = 30000;
        double rateUSD = 78.5;
        double dollars = rubles / rateUSD;
        System.out.println("У вас на счету" + " " + rubles + " "
                + "рублей. В долларах это" + " " + dollars + " " + "долларов. Так держать!");
    }
}

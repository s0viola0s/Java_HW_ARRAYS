package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalcAmountSales() {
        StatsService service = new StatsService();

        long[] salesStat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        int actualAmount = service.calcAmountSales(salesStat);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldCalcAverageAmountSales() {
        StatsService service = new StatsService();

        long[] salesStat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAmount = service.calcAverageAmountSales(salesStat);

        Assertions.assertEquals(expectedAverage, actualAmount);
    }

    @Test
    public void shouldCalcMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] salesStat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.calcMaxSalesMonth(salesStat);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldCalcMinSalesMonth() {
        StatsService service = new StatsService();

        long[] salesStat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.calcMinSalesMonth(salesStat);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldCalcBelowAverageMonth() {
        StatsService service = new StatsService();

        long[] salesStat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calcBelowAverage(salesStat);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAboveAverageMonth() {
        StatsService service = new StatsService();

        long[] salesStat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calcAboveAverage(salesStat);

        Assertions.assertEquals(expected, actual);
    }
}

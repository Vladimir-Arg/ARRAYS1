package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindMonthWithMinSales() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.minSales(temps);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindMonthWithMaxSales() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.maxSales(temps);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldAverageSumOfAllMonths() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        int actualSum = service.averageSales(temps);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldMonthSalesUpperAverageSales() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 10;
        int actualSum = service.monthSalesUpperAverageSales(temps);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldMonthSalesLowerAverageSales() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 2;
        int actualSum = service.monthSalesLowerAverageSales(temps);
        Assertions.assertEquals(expectedSum, actualSum);
    }

}

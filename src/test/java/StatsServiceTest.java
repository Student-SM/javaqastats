import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.javaqastats.services.StatsService;

public class StatsServiceTest {

    @Test
    public void minMount() {
        //месяц с минимальными продажами
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void maxMount() {
        //месяц с максимальными продажами
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void sumMonth() {
        //сумма всех месяцев
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumMonthSales(sales);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void avgMonth() {
        //средние продажи в месяц
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.avgMonthSales(sales);

        Assertions.assertEquals(expected,actual);

}

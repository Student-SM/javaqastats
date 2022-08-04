package ru.netology.stats.javaqastats.services;


import org.jetbrains.annotations.NotNull;

public class StatsService {

    public int minSales(long[] sales) {
        //месяц с минимальными продажами
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        //месяц с максимальными продажами
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;

    }

    public long sumMonthSales(long[] sales) {
        // сумма всех месяцев
        long sumMonth = 0;
        for (long sale : sales) {
            sumMonth += sale;
            //for (long i = 0; i <= 12; i++) {
            //  sumMonth += i + 1;
        }
        return sumMonth;
    }

    public long avgMonthSales(long[] sales) {
        //средние продажи в месяц
        //      long sumMonth = 0;
        //     long avgMonth = 0;
        //    for (long i = 0; i <= 12; i++) {
        //         sumMonth += i + 1;
        //         avgMonth = sumMonth / 12;

        long sumMonth = 0;
        for (long sale : sales) {
            sumMonth += sale;
    }
    //     return avgMonth;
        return sumMonth / 12;
}

    public long countmoreavg(long[] sales) {
        //продажи выше средних

        int count = 0;
        long avgMont = avgMonthSales(sales);
        for (long sale : sales) {
            if (sale > avgMonthSales(sales)) {
                count++;
            }
        }
        return count;

    }

    public long countlessavg(long[] sales) {

        int count = 0;
        long avgMont = avgMonthSales(sales) / 2;
        for (long sale : sales) {
            if (sale < avgMonthSales(sales)) {
                count++;
            }
            return count;

        }

        return avgMont;
    }

}

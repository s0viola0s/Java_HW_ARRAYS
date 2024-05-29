package ru.netology.stats;

public class StatsService {

    // сумма всех продаж
    public long calcAmountSales(long[] salesStat) {
        int amount = 0;
        for (int i = 0; i < salesStat.length; i++) {
            amount += salesStat[i];
        }
        return amount;
    }

    // средняя сумма продаж в месяц
    public long calcAverageAmountSales(long[] salesStat) {
        long averageAmount = calcAmountSales(salesStat) / salesStat.length;
        return averageAmount;
    }

    // номер последнего месяца, в котором был пик продаж (продажи на максимальную сумму);
    public int calcMaxSalesMonth(long[] salesStat) {
        int maxMonth = 0;

        for (int i = 0; i < salesStat.length; i++) {
            if (salesStat[i] >= salesStat[maxMonth]) {
                maxMonth = i;
            }
        }
        maxMonth++;
        return maxMonth;
    }

    // номер последнего месяца, в котором был минимум продаж (продажи на минимальную сумму);
    public int calcMinSalesMonth(long[] salesStat) {
        int minMonth = 0;

        for (int i = 0; i < salesStat.length; i++) {
            if (salesStat[i] <= salesStat[minMonth]) {
                minMonth = i;
            }
        }
        minMonth++;
        return minMonth;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int calcBelowAverage(long[] salesStat) {
        int count = 0;
        long average = calcAverageAmountSales(salesStat);
        for (int i = 0; i < salesStat.length; i++) {
            if (salesStat[i] < average) {
                count++;
            }
        }
        return count;
    }

    // количество месяцев, в которых продажи были выше среднего
    public int calcAboveAverage(long[] salesStat) {
        int count = 0;
        long average = calcAverageAmountSales(salesStat);
        for (int i = 0; i < salesStat.length; i++) {
            if (salesStat[i] > average) {
                count++;
            }
        }
        return count;
    }
}

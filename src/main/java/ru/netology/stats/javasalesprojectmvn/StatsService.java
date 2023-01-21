package ru.netology.stats.javasalesprojectmvn;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public long averageAmount(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result / 12;
    }

    public long monthBelowTheAverage(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            if (sale < averageAmount(sales)) {
                result++;
            }
        }
        return result;
    }

    public long monthAboveAverage(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            if (sale > averageAmount(sales)) {
                result++;
            }
        }
        return result;
    }

    public int monthMinSale(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= minSale) {
                minMonth = i;
                minSale = sales[i];
            }
        }
        return minMonth;
    }
    public int monthMaxSale(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= maxSale) {
                maxMonth = i;
                maxSale = sales[i];
            }
        }
        return maxMonth;
    }
}
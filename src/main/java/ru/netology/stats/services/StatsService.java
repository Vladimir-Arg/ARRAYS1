package ru.netology.stats.services;

public class StatsService {
    public int minSales(long[] sales) { // номер месяца в котором были минимальные продажи
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    
    public int maxSales(long[] sales) { // номер месяца в котором были максимальные продажи
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int sumSales(long[] sales) { // сумма всех продаж
        int sumSale = 0; // сумма продаж по всем месяцам
        for (int i = 0; i < sales.length; i++) {
            sumSale = (int) (sales[i] + sumSale); // суммирование продаж текущего месяца и продаж предыдущих периодов

        }
        return sumSale; // сумма продаж всех месяцев
    }



    public int averageSales(long[] sales) { // средняя сумма продаж в месяц;
        int averageSale = sumSales(sales) / sales.length;; // средняя сумма продаж в месяц
        return averageSale;
    }

    public int monthSalesUpperAverageSales(long[] sales) { // количество месяцев, в которых продажи были выше среднего;

        int averageSale = averageSales(sales); // средняя сумма продаж в месяц
        int monthSaleUp = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) { // значит, в рассматриваемом i-м месяце продаж меньше
                monthSaleUp = monthSaleUp + 1; // увеличиваем счетчик месяцев
            }
        }
        return monthSaleUp;
    }

    public int monthSalesLowerAverageSales(long[] sales) { // количество месяцев, в которых продажи были ниже среднего;

        int averageSale = averageSales(sales); // средняя сумма продаж в месяц
        int monthSaleLow = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= averageSale) { // значит, в рассматриваемом i-м месяце продаж меньше
                monthSaleLow = 1 + monthSaleLow; // увеличиваем счетчик месяцев
            }
        }
        return monthSaleLow;
    }
}
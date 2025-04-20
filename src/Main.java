public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] expenses1 = {4600, 6090, 9500, 6700, 1450};
        int minExpense = expenses1[0];
        int maxExpense = expenses1[0];

        for (int expense : expenses1) {
            if (expense < minExpense) {
                minExpense = expense;
            }
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");


        int[] expenses2 = {4600, 6090, 9500, 6700, 1450};
        int total1 = 0;
        for (int expense2 : expenses2) {
            total1 += expense2;
        }
        double middleAverage = (double) total1 / expenses2.length;
        System.out.println("Средняя сумма трат за месяц составила " + middleAverage + " рублей.");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
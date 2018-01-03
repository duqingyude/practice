package dategenerated20180103;

/*
 * 1、3、5、7、8、10、12月每月31天
 * 4、6、9、11 30天
 * 2月闰年29天,不是闰年就是28天.
 * */
public class DateGenerated {
    private static int year = 2018;

    public static void main(String[] aegs) {
        for (int month = 1; month <= 12; month++) {
            if (month == 2) {
                if (isALeapYear()) {
                    getday(month, 29);
                } else {
                    getday(month, 28);
                }
            } else {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    getday(month, 31);
                } else {
                    getday(month, 30);
                }
            }
        }
    }

    private static void getday(int month, int max) {
        for (int day = 1; day <= max; day++) {
            System.out.println(year + "年" + month + "月" + day + "日");
            System.out.println("========================================================================================");
        }
    }

    private static boolean isALeapYear() {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}

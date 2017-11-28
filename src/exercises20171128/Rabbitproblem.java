package exercises20171128;

/*
【程序1】
题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 */

import java.util.Scanner;

public class Rabbitproblem {
    public static void main(String[] args) {
        int temporary = 0;
        int thisMonth = 1;
        int lastMonth = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the month:");
        int month = sc.nextInt();
        System.out.println("month:1 rabbit:1");
        for (int i = 2; i <= month; i++) {
            temporary = thisMonth;
            thisMonth = thisMonth + lastMonth;
            lastMonth = temporary;
            System.out.println("month:" + i + " rabbit:" + thisMonth);
        }
//        System.out.println("test");
    }
}

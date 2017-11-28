package exercises20171128;

/*
【程序2】
题目：判断101-200之间有多少个素数，并输出所有素数。
程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。
 */
public class Procedure2 {
    public static void main(String[] args) {
        System.out.println("素数有：");
        for (int i = 101; i <= 200; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}

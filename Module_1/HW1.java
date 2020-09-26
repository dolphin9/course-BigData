/*
 * 项目名称：Module1-HW1
 * 项目功能： 输入一个日期，判断这天是当年的第几天
 * 作    者： dolphin9
 * 版    本： v1.0
 * 所 有 者： 无
 * 备    注：
*/

import java.util.Scanner;

public class HW1 {
    public static void main(final String[] arg) {
        final Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份");
        int yy = scan.nextInt();
        System.out.println("请输入月份");
        int mm = scan.nextInt();
        System.out.println("请输入日期");
        int dd = scan.nextInt();
        //System.out.println(yy + mm + dd );
        int[] dayOfMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (isLeapYear(yy)) {
            dayOfMonth[2] = 29;
        }
        int day=0,i;
        for (i = 1; i < mm; i++) {
            day += dayOfMonth[i];
        }
        day += dd;
        System.out.println(day);
    }
    public static boolean isLeapYear(int yy) {
        if(yy%4 == 0 && yy%100 !=0)
            return true;
        else if (yy%400 == 0)
            return true;
        else 
            return false;
    }
}


/*
 * ��Ŀ���ƣ�Module1-HW1
 * ��Ŀ���ܣ� ����һ�����ڣ��ж������ǵ���ĵڼ���
 * ��    �ߣ� dolphin9
 * ��    ���� v1.0
 * �� �� �ߣ� ��
 * ��    ע��
*/

import java.util.Scanner;

public class HW1 {
    public static void main(final String[] arg) {
        final Scanner scan = new Scanner(System.in);
        System.out.println("���������");
        int yy = scan.nextInt();
        System.out.println("�������·�");
        int mm = scan.nextInt();
        System.out.println("����������");
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


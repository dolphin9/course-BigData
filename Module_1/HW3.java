/*
 * ��Ŀ���ƣ�Module1-HW3
 * ��Ŀ���ܣ� ʵ��˫ɫ��齱��Ϸ�н��������ɣ��н�������6��������루1��33����1��������루1��16����ɡ�
 * ��    �ߣ� dolphin9
 * ��    ���� v1.0
 * �� �� �ߣ� ��
 * ��    ע��
*/
import java.util.Scanner;
import java.util.Random;

public class HW3 {
    public static void main(String[] arg){
        Random r = new Random();
        int i;
        System.out.println("����˫ɫ�������...");
        for(i=0;i<6;i++){
            System.out.print(i+1);
            System.out.print("�ź���\t");
            System.out.println(r.nextInt(32)+1);
        }
        System.out.print("����\t\t");
        System.out.println(r.nextInt(17)+1);
    }
    
}
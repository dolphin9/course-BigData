/*
 * ��Ŀ���ƣ�Module1-HW4
 * ��Ŀ���ܣ� �Զ����������ݹ��򣬵��Ѵ洢Ԫ�������ﵽ�������� 80%ʱ������ 1.5 ��
 * ��    �ߣ� dolphin9
 * ��    ���� v1.0
 * �� �� �ߣ� ��
 * ��    ע��
*/

import java.util.Scanner;

public class HW4 {
    
    public static void main(String[] args){
        final double useRate = 0.8;
        final double changeRate = 1.6;

        int[] arr = new int[5] ;
        int i,num,tmp=0 ;

        System.out.println("������һ���䳤���飬���Ѵ洢Ԫ�������ﵽ�������� 80% ʱ���Զ����� 1.5 ��\n Ŀǰ���鳤��Ϊ��"+arr.length);
        Scanner scan = new Scanner(System.in);
        
        System.out.print("arr[0] = ");
        while(scan.hasNext()){
           arr[tmp]= scan.nextInt();
            if (++tmp >= (arr.length * useRate)) {
                System.out.println("==================================================");
                System.out.println("��ǰ������"+tmp+"�������ѽ����鳤�ȵ���Ϊ"+(int)(arr.length*changeRate));
                System.out.print("ԭʼ������Ԫ��Ϊ��[");
                for (int js : arr) {
                    System.out.print(js +",");
                }
                System.out.println("]");
                int[] changeArr = new int[(int) (arr.length * changeRate)];
                for (i = 0; i < arr.length; i++)
                    changeArr[i] = arr[i];
                arr=changeArr;
                
                System.out.print("���º�������Ԫ��Ϊ��[");
                for (int js : arr) {
                    System.out.print(js +",");
                }
                System.out.println("]");
                System.out.println("==================================================");
            }
            System.out.print("arr[" + tmp + "] = ");
            
        }
    }
}

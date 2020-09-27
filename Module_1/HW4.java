/*
 * 项目名称：Module1-HW4
 * 项目功能： 自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍
 * 作    者： dolphin9
 * 版    本： v1.0
 * 所 有 者： 无
 * 备    注：
*/

import java.util.Scanner;

public class HW4 {
    
    public static void main(String[] args){
        final double useRate = 0.8;
        final double changeRate = 1.6;

        int[] arr = new int[5] ;
        int i,num,tmp=0 ;

        System.out.println("现在有一个变长数组，当已存储元素数量达到总容量的 80% 时，自动扩容 1.5 倍\n 目前数组长度为："+arr.length);
        Scanner scan = new Scanner(System.in);
        
        System.out.print("arr[0] = ");
        while(scan.hasNext()){
           arr[tmp]= scan.nextInt();
            if (++tmp >= (arr.length * useRate)) {
                System.out.println("==================================================");
                System.out.println("当前已输入"+tmp+"个数，已将数组长度调整为"+(int)(arr.length*changeRate));
                System.out.print("原始数组内元素为：[");
                for (int js : arr) {
                    System.out.print(js +",");
                }
                System.out.println("]");
                int[] changeArr = new int[(int) (arr.length * changeRate)];
                for (i = 0; i < arr.length; i++)
                    changeArr[i] = arr[i];
                arr=changeArr;
                
                System.out.print("更新后数组内元素为：[");
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

/*
 * 项目名称：Module1-HW3
 * 项目功能： 实现双色球抽奖游戏中奖号码生成，中奖号码由6个红球号码（1至33）和1个篮球号码（1至16）组成。
 * 作    者： dolphin9
 * 版    本： v1.0
 * 所 有 者： 无
 * 备    注：
*/
import java.util.Scanner;
import java.util.Random;

public class HW3 {
    public static void main(String[] arg){
        Random r = new Random();
        int i;
        System.out.println("生成双色球号码中...");
        for(i=0;i<6;i++){
            System.out.print(i+1);
            System.out.print("号红球：\t");
            System.out.println(r.nextInt(32)+1);
        }
        System.out.print("蓝球：\t\t");
        System.out.println(r.nextInt(17)+1);
    }
    
}
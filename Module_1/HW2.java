/* 项目名称：Module1-HW2
 * 项目功能： 找出1000以内的所有完数（完数等于它的所有因子之和）
 * 作    者： dolphin9
 * 版    本： v1.0
 * 所 有 者： 无
 * 备    注：
*/
public class HW2 {
    public static void main(String[] arg){
        int i,sum=0;
        for(i=1;i<=999;i++)
            if(isPerfectNumber(i)){                 //判断i是否为完数
                sum++;
            }
                
        System.out.println(sum);
    }
    public static boolean isPerfectNumber(int a){
        int i;
        int sum = 0;                                //sum为i的所有真因子之和
        for(i=1;i<a;i++){                            
            if (a % i == 0)
                sum += i;
        }
           
        if(sum == a)
            return true;
        else
            return false;        
    }







}

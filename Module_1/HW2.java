/* ��Ŀ���ƣ�Module1-HW2
 * ��Ŀ���ܣ� �ҳ�1000���ڵ�������������������������������֮�ͣ�
 * ��    �ߣ� dolphin9
 * ��    ���� v1.0
 * �� �� �ߣ� ��
 * ��    ע��
*/
public class HW2 {
    public static void main(String[] arg){
        int i,sum=0;
        for(i=1;i<=999;i++)
            if(isPerfectNumber(i)){                 //�ж�i�Ƿ�Ϊ����
                sum++;
            }
                
        System.out.println(sum);
    }
    public static boolean isPerfectNumber(int a){
        int i;
        int sum = 0;                                //sumΪi������������֮��
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

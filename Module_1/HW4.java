/*
 * ��Ŀ���ƣ�Module1-HW3
 * ��Ŀ���ܣ� ��ӡ0�±꿪ʼ��16*16��С����������Ϸ����
 * ��    �ߣ� dolphin9
 * ��    ���� v1.0
 * �� �� �ߣ� ��
 * ��    ע��
*/


public class HW4 {
    public static void main(String[] args) {
        final char[] index={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        int i,j;
        System.out.print("  ");
        for(i=0;i<16;i++){
            System.out.print(index[i]+" ");
        }
        for(i=0;i<16;i++){
            System.out.println();
            System.out.print(index[i]+" ");
            for(j=0;j<16;j++){
                System.out.print("+ ");
            }
        }
    }
    
}

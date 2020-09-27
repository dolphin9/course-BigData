/*
 * 项目名称：Module1-HW3
 * 项目功能： 打印0下标开始的16*16大小的五子棋游戏棋盘
 * 作    者： dolphin9
 * 版    本： v1.0
 * 所 有 者： 无
 * 备    注：
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

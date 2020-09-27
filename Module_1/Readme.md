# HW1:计算一年中的第几天
## 思路：
1. 按照输出提示输入日期
1. 判断当前这一年是否为闰年，使用isLeapYear(当前年信息)判断，是返回true，不是返回false，闰年2月为29天
2. 将当前月份之前的所有月份相应的天数相加
3. 将当前日期加入天数总和
5. 输出答案
# HW2：寻找1000以内的完美数个数
## 思路：
1. 从1到999循环，判断当前数是否为完美数:isPerfectNumber(int a) ,是返回true，不是返回false
2. 判断完美数时，从1开始循环到a-1，（此处可以优化到(a/2+1)）,判断a是否能整除当前数（%），如果是则加入一个初始值为0的变量sum。
3. 判断sum是否和a相等，是就返回true，不是返回false；

# HW3：产生双色球
## 思路：
Java中，随机数可以调用java.util.random中的Random类，使用：
````java
Random r = new Random();
r.nextInt(upbound)
````
可以生成0~upbound之间的数。
由于双色球的数字是从1开始到33或16，因此将随机数上限分别设为32与16，产生随机数后加一即为[1,33]以及[1,16]区间的随机数

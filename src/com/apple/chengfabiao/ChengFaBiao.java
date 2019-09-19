/**
*@program:乘法表
*@Description:JAVA
*@author:郑敏
*@date:2019.09.18
*/
public class Convert {  
 public static void main(String[] args) {
  for(int i = 1; i <= 9; i++) {
   for(int j = 1; j <= i; j++) {
    System.out.print(i+"*"+j+"="+j*i+" ");   
   }   
  System.out.print("\n");  
  }
 }
}
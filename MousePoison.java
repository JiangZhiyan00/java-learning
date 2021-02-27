import java.util.Scanner;
/*
 * to search the one with poison from bottles
 * @author Sunkun
 * Date: 2013.09.26
 */
public class MousePoison {
 public static void main(String[] args) {
  int bottle, tester; // bottle为瓶子数，tester为实验者个数
  Scanner input = new Scanner(System.in);
  
  // 判断保证输入能得到实验结果
  while(true){
   System.out.println("请分别输入瓶数和实验者(如老鼠)数");
   bottle = input.nextInt();
   tester = input.nextInt();
   if(Math.pow(2, tester) < bottle){
    System.out.println("此方案不能实现实验要求!\n请重新输入");
    continue;
   }else{
    break;
   }
  }
  
  // 要求用户，按要求输入1星期后，实验的观察结果
  System.out.println("系统已经自动给实验者，按从1至" + tester + "的顺序依次排序,并贴上标签");
  System.out.println("已按实验要求(思想为二进制)实验，已经过了1星期");
  System.out.println("请用户依次输入1星期后死亡的实验者编号");
  System.out.println("请用户输入总共死亡的个数:");
  int dead = input.nextInt(); // dead用于储存死亡的个数
  
  System.out.println("它们的编号从小到大依次为:");
  int[] number = new int[dead]; // number数组用于储存死亡试验品的标签序号
  for(int i = 0; i < dead; i++){
   number[i] = input.nextInt();
  }
  //@JZY:以下看不懂了----------
  char a[] = new char[tester];
  char b[] = new char[tester];
        for(int i = 0; i < tester; i++){
         a[i] = '0';
        }
        for(int i = 0; i < dead; i++){
         a[number[i]-1] = '1';
        }
  
  // 把实验结果逆序
  for(int i = 0; i < tester; i++){
   b[tester-i-1] = a[i];
  }
  
  // 把逆序后的实验结果(二进制)转换为十进制
  double result1 = 0;
  for(int i = 0; i < tester; i++){
   if(b[i] == '1'){
    result1 = result1 + Math.pow(2, tester-i-1);
   }
  }
 
  // 根据实验结果判断有毒的是哪一瓶
  for(int i = 0; i < bottle; i++){
   if(result1 == i){
    System.out.println("得出有毒的是第" + (i+1) + "瓶");
    break;
   }else{
    continue;
   }
  }
 }
}
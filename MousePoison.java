import java.util.Scanner;
/*
 * to search the one with poison from bottles
 * @author Sunkun
 * Date: 2013.09.26
 */
public class MousePoison {
 public static void main(String[] args) {
  int bottle, tester; // bottleΪƿ������testerΪʵ���߸���
  Scanner input = new Scanner(System.in);
  
  // �жϱ�֤�����ܵõ�ʵ����
  while(true){
   System.out.println("��ֱ�����ƿ����ʵ����(������)��");
   bottle = input.nextInt();
   tester = input.nextInt();
   if(Math.pow(2, tester) < bottle){
    System.out.println("�˷�������ʵ��ʵ��Ҫ��!\n����������");
    continue;
   }else{
    break;
   }
  }
  
  // Ҫ���û�����Ҫ������1���ں�ʵ��Ĺ۲���
  System.out.println("ϵͳ�Ѿ��Զ���ʵ���ߣ�����1��" + tester + "��˳����������,�����ϱ�ǩ");
  System.out.println("�Ѱ�ʵ��Ҫ��(˼��Ϊ������)ʵ�飬�Ѿ�����1����");
  System.out.println("���û���������1���ں�������ʵ���߱��");
  System.out.println("���û������ܹ������ĸ���:");
  int dead = input.nextInt(); // dead���ڴ��������ĸ���
  
  System.out.println("���ǵı�Ŵ�С��������Ϊ:");
  int[] number = new int[dead]; // number�������ڴ�����������Ʒ�ı�ǩ���
  for(int i = 0; i < dead; i++){
   number[i] = input.nextInt();
  }
  //@JZY:���¿�������----------
  char a[] = new char[tester];
  char b[] = new char[tester];
        for(int i = 0; i < tester; i++){
         a[i] = '0';
        }
        for(int i = 0; i < dead; i++){
         a[number[i]-1] = '1';
        }
  
  // ��ʵ��������
  for(int i = 0; i < tester; i++){
   b[tester-i-1] = a[i];
  }
  
  // ��������ʵ����(������)ת��Ϊʮ����
  double result1 = 0;
  for(int i = 0; i < tester; i++){
   if(b[i] == '1'){
    result1 = result1 + Math.pow(2, tester-i-1);
   }
  }
 
  // ����ʵ�����ж��ж�������һƿ
  for(int i = 0; i < bottle; i++){
   if(result1 == i){
    System.out.println("�ó��ж����ǵ�" + (i+1) + "ƿ");
    break;
   }else{
    continue;
   }
  }
 }
}
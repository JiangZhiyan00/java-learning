//将一个数组打乱输出
package leetcode;
//import java.util.*;
class RandomNums{
	int[] a;
	public RandomNums(int[] nums) {
		this.a=nums;
	}
	public void method() {
		int[] b = new int[a.length];//定义一个与给定数组等长的数组b,用于接收a数组打乱后的值
		java.util.Random randomNums =new java.util.Random();
		int[] c =new int[a.length];//定义一个与给定数组等长的数组c,用于接收已被b接收的a数组的值的下标
		for(int i=0;i<a.length;i++){
			int j=randomNums.nextInt(a.length);
			for(int k = 0;k<i;k++) {
				if(j == c[k]) {
					j=randomNums.nextInt(a.length);
					k =-1;
					continue;
				}
			}
		b[i]=a[j];
		c[i]=j;
			System.out.print(b[i]+" ");
		}
	}
}

public class Exercise002 {

	public static void main(String[] args) {
		int[] arr1= {0,1,2,3,4,5,6,7,8,9};
		RandomNums r1 =new RandomNums(arr1);
		r1.method();
		
	}

}

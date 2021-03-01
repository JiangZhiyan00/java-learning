/*
给定一个整数数组nums和一个整数目标值target,请你在该数组中找出和为目标值的那两个整数,并返回它们的数组下标。
示例：
	输入：nums = [2,7,11,15],target = 9
	输出：[0,1]
	解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
*/
package leetcode;
import java.util.Scanner;
class Solution {
    public void twoSum() {
        System.out.print("请输入数组长度:");
        Scanner s = new Scanner(System.in);
        int numsLength = s.nextInt();
        int[] nums=new int[numsLength];
        System.out.print("请输入数组元素:");
    	Scanner input1 = new Scanner(System.in);
        for(int i = 0;i<nums.length;i++) {
        	nums[i]=input1.nextInt();
        }
        System.out.print("请输入目标值:");
        Scanner input2 = new Scanner(System.in);
        int target=input2.nextInt();
        int [] sort = new int[2];
        for(int j=0;j<nums.length;j++) {
        	for(int k=j+1;k<nums.length;k++) {
        		if(target==nums[j]+nums[k]) {
        			System.out.println("["+j+","+k+"]");
        		}
        	}
        } 
    }
}

public class Exercise001 {
	public static void main(String[] args) {
		Solution a = new Solution();
		a.twoSum();
	}
}

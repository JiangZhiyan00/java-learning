/*回文数的判断:1个数字正序和倒序相等,则返回true,否则返回false.
        例:121 返回 true
           123 返回 false*/
package Exercise.e003;

public class Exercise003 {
    public static void main(String[] args) {
        HuiWenShu h = new HuiWenShu();
        System.out.println((h.isPalindrome(121)));
    }
}
class HuiWenShu{
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int num = x;
        int fanNum = 0;
        while(num != 0){
            fanNum = fanNum*10+num%10;
            num/=10;
        }
        return fanNum==x;

    }
}
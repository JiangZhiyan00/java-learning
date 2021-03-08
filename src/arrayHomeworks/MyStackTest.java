package arrayHomeworks;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack ms = new MyStack(new Object[3]);
        ms.push("第一次压栈");
        ms.printArray();
        ms.push("第二次压栈");
        ms.printArray();
        ms.push("第三次压栈");
        ms.printArray();
        ms.push("第四次压栈?");//第4次压栈失败,系统提示
        System.out.println("==================================");
        ms.pop();//第1次弹栈
        ms.printArray();
        ms.pop();//第2次弹栈
        ms.printArray();
        ms.pop();//第3次弹栈
        ms.printArray();
        ms.pop();//第4次弹栈失败,系统提示
    }
}

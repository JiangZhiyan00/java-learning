package arrayHomeworks;
/*模拟栈数据结构压栈push/弹栈pop的动作,栈满/栈空时要有提示*/
public class MyStack {
    Object[] elements;

    public MyStack() {//无参构造
    }

    public MyStack(Object[] elements) {//有参构造,形参为Object类型数组
        this.elements = elements;
    }
    public Object[] push(Object element){//push方法模拟压栈
        //首先判断对象的elements数组最后1个元素是否为null,不为null代表"栈"已满,需提示用户
        if (elements[elements.length-1]!=null){
            System.out.println("栈内存大小为:"+elements.length+",现有元素:"+elements.length+",请及时弹栈!");
            return elements;
        }
        //实参element赋值给数组最前面的一个元素,模拟压栈
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null){
                elements[i] = element;
                break;//赋值完成要终止循环
            }
        }
        return elements;
    }
    public Object[] pop(){//pop方法模拟弹栈
        //首先判断对象的elements数组第1个元素是否为null,若为null代表"栈"已空,需提示用户
        if (elements[0]==null){
            System.out.println("栈内存现有元素:0,无需弹栈!");
            return elements;
        }
        //将null赋值给数组最后的一个元素,模拟弹栈
        for (int i = elements.length-1; i >= 0; i--) {
            if (elements[i] != null){
                elements[i] = null;
                break;
            }
        }
        return elements;
    }
    //遍历数组并打印
    public void printArray(){
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i]+" ");
        }
        System.out.println();
    }
}

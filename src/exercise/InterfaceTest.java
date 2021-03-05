package interfaceLearning;

public class InterfaceTest {
    public static void main(String[] args) {
        FoodMenu fm1 = new AmericanCook();//创建FoodMenu类型的对象,变量fm1保存的地址指向它,对象中的属性都为null
        //创建Customer类型的对象,变量c1指向它,将变量fm1的值(保存的地址)赋给对象的属性food,food不为null,food中有fm1的地址
        Customer c1 = new Customer(fm1);
        c1.order(fm1);
        FoodMenu fm2 = new ChineseCook();
        Customer c2 =new Customer(fm2);
        c2.order();
    }
}
class Customer{
    private FoodMenu food;

    public Customer() {
    }

    public Customer(FoodMenu food) {
        this.food = food;
    }

    public FoodMenu getFood() {
        return food;
    }

    public void setFood(FoodMenu food) {
        this.food = food;
    }
    public void order(){
       this.getFood().food1();
       this.getFood().food2();
    }
    public void order(FoodMenu food){
        food.food1();
        food.food2();

    }
}
interface FoodMenu{
    void food1();
    void food2();
}
class ChineseCook implements FoodMenu{
    @Override
    public void food1() {
        System.out.println("中餐师傅做的食物1,辣味");
    }
    @Override
    public void food2() {
        System.out.println("中餐师傅做的食物2,辣味");
    }
}
class AmericanCook implements FoodMenu{
    @Override
    public void food1() {
        System.out.println("西餐师傅做的食物1,甜味");
    }
    @Override
    public void food2() {
        System.out.println("西餐师傅做的食物2,甜味");
    }
}
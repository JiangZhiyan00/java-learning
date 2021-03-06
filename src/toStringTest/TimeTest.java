package toStringTest;

public class TimeTest{
    public static void main(String[] args){
        MyTime t = new MyTime(2021,3,7);
        System.out.println(t.toString());//输出2021/3/7
    }
}
class MyTime{
    int year;
    int month;
    int day;
    public MyTime(){//无参构造方法
    }
    public MyTime(int year,int month,int day){//有参构造方法
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public String toString(){//重写toString()方法
        return year+"/"+month+"/"+day;
    }
}
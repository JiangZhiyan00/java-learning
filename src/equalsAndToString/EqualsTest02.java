package equalsLearning;

public class EqualsTest02 {
    public static void main(String[] args) {
        Address addr1 = new Address("杭州","萍水街","123456");
        People p1 = new People("张三",addr1);
        Address addr2 = new Address("杭州","萍水街","123456");
        People p2 = new People("张三",addr2);
        Address addr3 = new Address("宁波","xx街","567890");
        People p3 = new People("李四",addr3);
        People p4 = null;
        System.out.println(p1.toString());//姓名:张三,地址:杭州市萍水街,邮编:123456,调用toString()方法
        System.out.println(p1.equals(p2));//true,调用equals()方法
        System.out.println(p2.equals(p3));//flase,调用equals()方法
        System.out.println(p3.equals(p4));//flase,调用equals()方法
        //System.out.println(p4.equals(p1));//空指针异常java.lang.NullPointerException,因为p4是null
    }
}
class People{
    private String name;
    private Address addr;

    public People() {//无参构造方法
    }

    public People(String name, Address addr) {//有参构造方法
        this.name = name;
        this.addr = addr;
    }
    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {//重写toString()方法
        return "姓名:"+getName()+","+getAddr().toString();
    }

    @Override
    public boolean equals(Object obj) {//重写equals()方法
        if (this == obj) return true;
        if (obj == null || !(obj instanceof People)) return false;
        People people = (People) obj;
        return getName().equals(people.getName()) && getAddr().equals(people.getAddr());
    }
}
class Address{
    private String city;
    private String street;
    private String zipcode;

    public Address() {//无参构造方法
    }

    public Address(String city, String street, String zipcode) {//有参构造方法
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
    //getter and setter
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {//重写toString()方法
        return "地址:"+getCity()+"市"+getStreet()+",邮编:"+getZipcode();
    }

    @Override
    public boolean equals(Object obj) {//重写equals()方法
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Address)) return false;
        Address address = (Address) obj;
        return getCity().equals(address.getCity())
                && getStreet().equals(address.getStreet())
                && getZipcode().equals(address.getZipcode());
    }
}
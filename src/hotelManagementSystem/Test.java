package hotelManagementSystem;

public class Test {
    public static void main(String[] args) {
        /*Hotel hotel = new Hotel();
        hotel.printRoom();
        hotel.dinFang(103);
        hotel.dinFang(201);
        hotel.dinFang(305);
        hotel.printRoom();
        hotel.tuiFang(103);
        hotel.tuiFang(201);
        hotel.tuiFang(305);
        hotel.printRoom();*/
        Hotel hotel1 = new Hotel(new Room[8][30]);
        hotel1.printRoom();
        hotel1.dinFang(506);
        hotel1.dinFang(602);
        hotel1.dinFang(703);
        hotel1.dinFang(804);
        hotel1.printRoom();
        hotel1.tuiFang(506);
        hotel1.tuiFang(602);
        hotel1.tuiFang(703);
        hotel1.tuiFang(804);
        hotel1.printRoom();
    }
}

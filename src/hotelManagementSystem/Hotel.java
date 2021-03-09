package hotelManagementSystem;

public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        rooms=new Room[3][20];
        for(int i = 0;i<rooms.length;i++){
            for(int j = 0;j<rooms[i].length;j++){
                rooms[i][j]=new Room();
                rooms[i][j].setRoomNum(100*(i+1)+j+1);
                if(i == 0){
                    rooms[i][j].setRoomType("标间");
                }else if(i==1){
                    rooms[i][j].setRoomType("双人间");
                }else if(i==2){
                    rooms[i][j].setRoomType("豪华套房");
                }else{
                    rooms[i][j].setRoomType("豪华"+(i-2)+"星");
                }
            }
        }
    }

    public Hotel(Room[][] rooms) {
        this.rooms = rooms;
        for(int i = 0;i<rooms.length;i++){
            for(int j = 0;j<rooms[i].length;j++){
                rooms[i][j]=new Room();
                rooms[i][j].setRoomNum(100*(i+1)+j+1);
                if(i == 0){
                    rooms[i][j].setRoomType("标间");
                }else if(i==1){
                    rooms[i][j].setRoomType("双人间");
                }else if(i==2){
                    rooms[i][j].setRoomType("豪华套房");
                }else{
                    rooms[i][j].setRoomType("豪华"+(i-2)+"星");
                }
            }
        }
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }
    public void dinFang(int roomNum){
        getRooms()[roomNum/100-1][roomNum%100-1].setRoomStatus(true);
        System.out.println(roomNum+"房间预定成功!");
    }
    public void tuiFang(int roomNum){
        getRooms()[roomNum/100-1][roomNum%100-1].setRoomStatus(false);
        System.out.println(roomNum+"房间退房成功!");
    }
    public void printRoom(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j].toString());
            }
            System.out.println();
        }
    }
}

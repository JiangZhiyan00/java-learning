package hotelManagementSystem;

public class Room {
    private int roomNum;
    private String roomType;
    private boolean roomStatus;

    public Room() {
    }

    public Room(int roomNum, String roomType, boolean roomStatus) {
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.roomStatus = roomStatus;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(boolean roomStatus) {
        this.roomStatus = roomStatus;
    }

    @Override
    public String toString() {
        return "["+getRoomNum()+"房,"+getRoomType()+","+(getRoomStatus()? "占用]":"空闲] ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null || !(o instanceof Room)) return false;
        Room room = (Room) o;
        return getRoomNum() == room.getRoomNum();
    }
}

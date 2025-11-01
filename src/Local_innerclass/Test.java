package Local_innerclass;

public class Test {
    public static void main(String[] args) {
        Hotel hotel=new Hotel("BLUE STAR ", 21,7);
        hotel.reserveRoomie("Alok ",14);
        hotel.reserveRoomie("Rahul ",1);
        hotel.reserveRoomie("",14);
        hotel.reserveRoomie("Avinash ",-6);
    }
}

package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(10, 23.2, true);
        showRoomInfo(room1);
        room1.decreaseTemperature();
        showRoomInfo(room1);
        room1.decreaseTemperature();
        showRoomInfo(room1);
        room1.decreaseTemperature();
        showRoomInfo(room1);
        room1.decreaseTemperature();
        showRoomInfo(room1);
        room1.decreaseTemperature();
    }

    private static void showRoomInfo(Room room) {
        System.out.println("Powierzchnia: " + room.getArea() + ", temperature: " + room.getTemperature() + ", airConditioner: " + room.isAirConditioner());
    }

}

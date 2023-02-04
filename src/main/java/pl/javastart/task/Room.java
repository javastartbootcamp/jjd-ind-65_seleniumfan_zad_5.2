package pl.javastart.task;

public class Room {
    private double area;
    private double temperature;
    private boolean airConditioner;
    private double minTemperature = 21.0;

    public Room(double area, double temperature, boolean airConditioner) {
        this.area = area;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
    }

    public boolean decreaseTemperature() {
        if (airConditioner && temperature > minTemperature) {
            if (temperature - 1 < minTemperature) {
                temperature = minTemperature;
            } else {
                temperature--;
            }
            return true;
        }
        return false;
    }

    public void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }

    public double getArea() {
        return area;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }
}

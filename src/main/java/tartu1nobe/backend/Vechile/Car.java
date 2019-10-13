package tartu1nobe.backend.Vechile;

public class Car {
    private String carId;
    private String batteryPercentage;

    public String getCarId() {
        return carId;
    }

    public String getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(String batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public String getChargingText() {
        return null;
    }

}

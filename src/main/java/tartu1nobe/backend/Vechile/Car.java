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
        int batteryPercentage = getBatteryPercentageAsInt();
        if (batteryPercentage <= 5) {
            return "Battery percentage critically low!";
        }
        else if (batteryPercentage <= 15) {
            return "Battery percentage very low";
        }
        else if (batteryPercentage <= 30) {
            return "Battery running low";
        }
        else if (batteryPercentage == 100) {
            return "Battery full";
        }
        else {
            return "Battery percentage OK";
        }
    }

    private int getBatteryPercentageAsInt() {
        return Integer.parseInt(batteryPercentage.substring(0, batteryPercentage.length() -1));
    }

}

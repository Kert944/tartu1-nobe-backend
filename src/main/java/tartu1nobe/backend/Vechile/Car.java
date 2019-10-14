package tartu1nobe.backend.Vechile;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String carId;
    private String batteryPercentage;
    private List<Window> windows;

    public Car() {
    }

    public Car(String carId, String batteryPercentage) {
        this(carId, batteryPercentage, constructWindows());
    }

    private static List<Window> constructWindows() {
        List<Window> windows = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            Window w = new Window();
            w.setStatus(OpenedClosedStatus.CLOSED);
            w.setOpenedPercentage(0);
            windows.add(w);
        }
        return windows;
    }

    public Car(String carId, String batteryPercentage, List<Window> windows) {
        this.carId = carId;
        this.batteryPercentage = batteryPercentage;
        this.windows = windows;
    }

    public String getCarId() {
        return carId;
    }

    public String getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(String batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
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

    public void openAllWindows() {
    }

    public void closeAllWindows() {
    }

    public void openAllWindows(int openedPercentage) {
    }

    public void closeAllWindows(int openedPercentage) {
    }
}

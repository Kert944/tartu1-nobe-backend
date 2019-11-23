package tartu1nobe.backend.CarParameters;

public class TemperatureParameter extends CarParameter {
    private int value;

    public TemperatureParameter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

package tartu1nobe.backend.CarParameters;

public class CarLocationParameter extends CarParameter {
    private Coordinate coordinate;

    public CarLocationParameter(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}

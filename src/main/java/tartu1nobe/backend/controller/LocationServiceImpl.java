package tartu1nobe.backend.controller;

import tartu1nobe.backend.CarParameters.Coordinate;

public class LocationServiceImpl implements LocationService {
    @Override
    public long getCarLongitude() {
        return 123456;
    }

    @Override
    public long getCarLatitude() {
        return 987654;
    }

    @Override
    public String getCarCoordinates() {
        return "long: 123456, lat: 987654";
    }

    @Override
    public Coordinate getCoordinate() {
        return new Coordinate(123456L, 987654L);
    }
}

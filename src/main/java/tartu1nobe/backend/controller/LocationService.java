package tartu1nobe.backend.controller;

import org.springframework.stereotype.Service;
import tartu1nobe.backend.CarParameters.Coordinate;

@Service
public interface LocationService {
    long getCarLongitude();
    long getCarLatitude();
    String getCarCoordinates();
    Coordinate getCoordinate();
}

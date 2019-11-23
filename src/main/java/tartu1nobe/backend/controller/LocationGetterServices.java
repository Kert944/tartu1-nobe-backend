package tartu1nobe.backend.controller;

import org.springframework.stereotype.Service;
import tartu1nobe.backend.CarParameters.Coordinate;

@Service
public interface LocationGetterServices {

    boolean setFakeCarLocation(long longitude, long latitude);
    Coordinate moveCar();
}

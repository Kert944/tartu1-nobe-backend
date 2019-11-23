package tartu1nobe.backend.controller;

import org.springframework.stereotype.Service;
import tartu1nobe.backend.CarParameters.CarParameter;

import java.util.List;

@Service
public interface CarParametersService {

    List<CarParameter> getCarParameters();
    void addCarParameterService(CarParameter carParameter);
    void addMultipleCarParameters(List<CarParameter> carParameters);
}

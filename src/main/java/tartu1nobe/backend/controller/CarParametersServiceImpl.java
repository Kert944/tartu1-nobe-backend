package tartu1nobe.backend.controller;

import tartu1nobe.backend.CarParameters.CarParameter;

import java.util.ArrayList;
import java.util.List;

public class CarParametersServiceImpl implements CarParametersService {
    @Override
    public List<CarParameter> getCarParameters() {
        return new ArrayList<>();
    }

    @Override
    public void addCarParameterService(CarParameter carParameter) {

    }

    @Override
    public void addMultipleCarParameters(List<CarParameter> carParameters) {

    }
}

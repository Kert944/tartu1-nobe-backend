package tartu1nobe.backend.controller;

import org.springframework.stereotype.Service;

@Service
public interface TemperatureControllerService {
    boolean changeTemperature(int temp);

    int getTemperature();
}

package tartu1nobe.backend.controller;

import org.springframework.stereotype.Service;

@Service
public interface BatteryPercentageService {

    String getBatteryPercentage();
    int getCharningLimit();
    boolean changeBatteryChargingLimit(int limit);
    long getBatteryPercantageCharnignLimit();
}

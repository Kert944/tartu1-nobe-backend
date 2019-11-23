package tartu1nobe.backend.controller;

import org.springframework.stereotype.Service;

@Service
public class BatteryPercentageServiceImpl implements BatteryPercentageService {
    @Override
    public String getBatteryPercentage() {
        return null;
    }

    @Override
    public int getCharningLimit() {
        return 0;
    }

    @Override
    public boolean changeBatteryChargingLimit(int limit) {
        return false;
    }

    @Override
    public long getBatteryPercantageCharnignLimit() {
        return 0;
    }
}

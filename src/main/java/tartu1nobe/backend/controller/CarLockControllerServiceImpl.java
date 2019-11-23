package tartu1nobe.backend.controller;

import org.springframework.stereotype.Service;

@Service("carLockControllerService")
public class CarLockControllerServiceImpl implements CarLockControllerService {
    @Override
    public boolean lock() {
        return true;
    }

    @Override
    public boolean unlock() {
        return true;
    }

    @Override
    public boolean isCarLocked() {
        return true;
    }
}

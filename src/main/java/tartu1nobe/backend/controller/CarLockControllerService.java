package tartu1nobe.backend.controller;

public interface CarLockControllerService {

    boolean lock();
    boolean unlock();
    boolean isCarLocked();
}

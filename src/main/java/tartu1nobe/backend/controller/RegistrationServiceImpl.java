package tartu1nobe.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("registrationService")
public class RegistrationServiceImpl implements RegistrationService {

    @Override
    public boolean registerUser(String userName, String password) {
        return true;
    }

    @Override
    public boolean validateCredentials(String userName, String password) {
        return true;
    }

    @Override
    public boolean validateAndRegisterUser(String userName, String password) {
        return true;
    }
}

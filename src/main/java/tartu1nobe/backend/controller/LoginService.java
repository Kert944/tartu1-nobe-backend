package tartu1nobe.backend.controller;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {

    boolean validateUser(String userName, String password);
    boolean performLogin();
}

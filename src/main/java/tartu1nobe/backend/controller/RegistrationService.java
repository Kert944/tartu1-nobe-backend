package tartu1nobe.backend.controller;

public interface RegistrationService {

    boolean registerUser(String userName, String password);

    boolean validateCredentials(String userName, String password);

    boolean validateAndRegisterUser(String userName, String password);
}

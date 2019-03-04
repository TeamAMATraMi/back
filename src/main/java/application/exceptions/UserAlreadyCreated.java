package application.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.CONFLICT, reason="User already exists")  // 409
public class UserAlreadyCreated extends RuntimeException {

    public UserAlreadyCreated() {
        super();
    }

}
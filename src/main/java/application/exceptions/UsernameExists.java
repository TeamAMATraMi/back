package application.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.CONFLICT, reason="User already exists")  // 409
public class UsernameExists extends RuntimeException {

    public UsernameExists() {
        super();
    }

}
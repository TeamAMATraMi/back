package application.controller;

import application.model.Utilisateur;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Date;

@RestController
@CrossOrigin
public class LoginController {

    @RequestMapping("/testlogin")
    public String login(@RequestBody Utilisateur user){

        String jwtToken = "";
        if(user.getUsername() == null && user.getPassword() == null){
            throw new SecurityException("Please fill in username and password");
        }

        // TODO : faire ça proprement
        if(!user.getUsername().equals("applitrami")) {
            throw new SecurityException("User name not found : " + user.getUsername());
        }

        if(!user.getPassword().equals("password")) {
            throw new SecurityException("Invalid password");
        }
        /*

        jwtToken = Jwts.builder().setSubject(user.getUsername())
                .claim("roles", "user")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretkey").compact();
                */

        return  jwtToken;
    }
}

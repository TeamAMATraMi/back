package application.controller;

import application.dao.UserRepository;
import application.exceptions.UsernameExists;
import application.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UtilisateurController {

    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private HttpServletRequest request;


    public UtilisateurController(UserRepository UserRepository,
                                 BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = UserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody Utilisateur applicationUser) {
        Utilisateur user = this.userRepository.findByUsername(applicationUser.getUsername());
        if (user != null) {
            throw new UsernameExists();
        } else {
            applicationUser.setPassword(bCryptPasswordEncoder.encode(applicationUser.getPassword()));
            System.out.println(applicationUser.toString());
            userRepository.save(applicationUser);
        }
    }
}

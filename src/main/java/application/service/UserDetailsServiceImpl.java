package application.service;

import application.dao.UserRepository;
import application.model.Utilisateur;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private UserRepository UserRepository;

    public UserDetailsServiceImpl(UserRepository UserRepository) {
        this.UserRepository = UserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Utilisateur ApplicationUser = UserRepository.findByUsername(username);
        if (ApplicationUser == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(ApplicationUser.getUsername(), ApplicationUser.getPassword(), emptyList());
    }
}
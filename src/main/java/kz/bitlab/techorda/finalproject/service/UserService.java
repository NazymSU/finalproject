package kz.bitlab.techorda.finalproject.service;

import kz.bitlab.techorda.finalproject.model.Permission;
import kz.bitlab.techorda.finalproject.model.User;
import kz.bitlab.techorda.finalproject.repository.PermissionRepository;
import kz.bitlab.techorda.finalproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    PermissionRepository permissionRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User student= userRepository.findByUsername(username);
       if(student != null){
           return  student;
       }else {
           throw  new UsernameNotFoundException("User Not found");
       }
    }

    public User addUser (User user){
        User checkUser=userRepository.findByUsername(user.getUsername());
        if(checkUser==null){
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setRepassword(passwordEncoder.encode(user.getRepassword()));
            Permission userPermission = permissionRepository.findByRole("ROLE_USER");
            if (userPermission == null) {
                userPermission = new Permission();
                userPermission.setRole("ROLE_USER");
                userPermission = permissionRepository.save(userPermission);
            }
            user.getPermissions().add(userPermission);
            return userRepository.save(user);
        }
        return null;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUsers(Long id){
        return userRepository.findById(id).orElse(new User());
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

}

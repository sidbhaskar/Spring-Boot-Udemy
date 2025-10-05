package com.Learning.SpringSecurity.service;

import com.Learning.SpringSecurity.Model.UserPrincipal;
import com.Learning.SpringSecurity.repository.UserRepo;
import com.Learning.SpringSecurity.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if(user == null){
            System.out.println("Username not found [404]");
            throw new UsernameNotFoundException("Username not found [404]");
        }
        return new UserPrincipal(user);
    }
}

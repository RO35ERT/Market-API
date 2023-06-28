package com.tumbwe.artisanmktplace.service;

import com.tumbwe.artisanmktplace.entity.User;
import com.tumbwe.artisanmktplace.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void updateUser(Long id, User user) {
        Optional <User> existing = userRepository.findById(id);

        if(existing.isPresent()){
            User updated = existing.get();
            if(user.getFirstName() !=null){
                updated.setFirstName(user.getFirstName());
            }
            if(user.getLastName() != null){
                updated.setLastName(user.getLastName());
            }
            if(user.getAddress() !=null){
                updated.setAddress(user.getAddress());
            }
            if(user.getPassword() !=null){
                updated.setPassword(user.getPassword());
            }
            if(user.getPhone() != null){
                updated.setPhone(user.getPhone());
            }

            userRepository.save(updated);
        }
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }
}

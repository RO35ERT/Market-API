package com.tumbwe.artisanmktplace.controller;

import com.tumbwe.artisanmktplace.entity.Artisan;
import com.tumbwe.artisanmktplace.entity.User;
import com.tumbwe.artisanmktplace.service.ArtisanService;
import com.tumbwe.artisanmktplace.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class Controller {
    @Autowired
    ArtisanService artisanService;

    @Autowired
    UserServiceImpl userService;



    //Artisan endpoints
    @PostMapping("/createArtisan")
    public String createArtisan(@RequestBody Artisan artisan){
        artisanService.createArtisan(artisan);
     return "Success";
    }

    @GetMapping("/artisans")
    public List<Artisan> getArtisans(){
        return artisanService.getArtisans();
    }

    @GetMapping("/artisan/{id}")
    public Optional<Artisan> getArtisan(@PathVariable("id") Long id){
        return artisanService.getArtisan(id);
    }
    @PutMapping("/artisan/edit/{id}")
    public String updateArtisan(@PathVariable("id") Long id, @RequestBody Artisan artisan){
        artisanService.updateArtisan(id, artisan);
        return "Updated successfully!";
    }

    //User endpoints
    @PostMapping("/createuser")
    public String createUser(@RequestBody User user){
        userService.createUser(user);
        return "User created";
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userService.getUser(id);
    }

    @PutMapping("/user/{id}/edit")
    public String updateUser(@PathVariable("id") Long id, @RequestBody User user){
        userService.updateUser(id, user);
        return "Updated successfully!";
    }


}

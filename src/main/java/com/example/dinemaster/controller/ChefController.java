/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.dinemaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.dinemaster.model.*;
import com.example.dinemaster.service.ChefJpaService;

@RestController
public class ChefController {
    @Autowired
    public ChefJpaService chefService;

    @GetMapping("/restaurants/chefs")
    public ArrayList<Chef> getAllChef() {
        return chefService.getAllChef();
    }

    @GetMapping("/restaurants/chefs/{chefId}")
    public Chef getChefById(@PathVariable("chefId") int chefId) {
        return chefService.getChefById(chefId);
    }

    @PostMapping("/restaurants/chefs")
    public Chef addCheff(@RequestBody Chef chef) {
        return chefService.addChef(chef);
    }

    @PutMapping("/restaurants/chefs/{chefId}")
    public Chef updateChef(@PathVariable("chefId") int chefId, @RequestBody Chef chef) {
        return chefService.updateChef(chefId, chef);
    }

    @DeleteMapping("/restaurants/chefs/{chefId}")
    public void deleteChef(@PathVariable("chefId") int chefId) {
        chefService.deleteChef(chefId);
    }

    @GetMapping("chefs/{chefId}/restaurant")
    public Restaurant getRestaurantByChefId(@PathVariable("chefId") int chefId) {
        return chefService.getRestaurantByChefId(chefId);
    }
}

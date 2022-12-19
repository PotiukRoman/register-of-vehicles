package com.example.registerofvehicles.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.registerofvehicles.repository.VehicleRepository;
import com.example.registerofvehicles.repository.UserRepository;
import com.example.registerofvehicles.domain.Vehicle;
import org.apache.commons.lang3.StringUtils;

import java.security.Principal;

@Controller
public class VehicleListController {

    private static final Logger logger = LoggerFactory.getLogger(VehicleListController.class);

    private final VehicleRepository repository;

    private final UserRepository userRepository;

    @Autowired
    public VehicleListController(VehicleRepository repository, UserRepository userRepository) {
        this.repository = repository;
        this.userRepository = userRepository;
    }

    @GetMapping
    public String indexPageStart(Model model, Principal principal) {
        logger.info("User name: {}", principal.getName());
        model.addAttribute("item", new Vehicle());
        return "index";
    }

    @GetMapping("/search")
    public String indexPageAfter2020(Model model, Vehicle item, Principal principal) {
        if (item.getVIN() != StringUtils.EMPTY) {
            logger.info("User name: {}", principal.getName());
            model.addAttribute("items", repository.findVehiclesByNREGNEW(item.getVIN()));
        }
        model.addAttribute("item", new Vehicle());
        return "index";
    }
}


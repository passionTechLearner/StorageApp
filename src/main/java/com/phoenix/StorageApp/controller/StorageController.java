package com.phoenix.StorageApp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.phoenix.StorageApp.model.CustomerData;
import com.phoenix.StorageApp.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @GetMapping("ping")
    public String healthCheck() {
        return "I am alive!!!";
    }

    @GetMapping("all-data")
    public List<CustomerData> getAllData() throws JsonProcessingException {
        return storageService.getAllData();
    }
}

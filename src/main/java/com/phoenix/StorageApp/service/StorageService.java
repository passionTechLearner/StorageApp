package com.phoenix.StorageApp.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.phoenix.StorageApp.model.CustomerData;
import com.phoenix.StorageApp.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Service
public class StorageService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StorageRepository storageRepository;
    public List<CustomerData> getAllData() throws JsonProcessingException {

        String resourceUrl = "http://localhost:3000/v1/all-data";

        List<CustomerData> customerDataList = (List<CustomerData>) restTemplate.exchange(resourceUrl, HttpMethod.POST, null, new ParameterizedTypeReference<List<CustomerData>>() {}).getBody();
        saveCustomerData(customerDataList);
        return  customerDataList;
    }

    public void saveCustomerData(List<CustomerData> customerDataList) {
        storageRepository.saveAll(customerDataList);
    }
}

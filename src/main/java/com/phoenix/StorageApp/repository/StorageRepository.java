package com.phoenix.StorageApp.repository;

import com.phoenix.StorageApp.model.CustomerData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepository extends CrudRepository<CustomerData,Integer> {
}

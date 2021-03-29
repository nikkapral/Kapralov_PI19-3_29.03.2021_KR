package com.example.kapralov.service;

import com.example.kapralov.model.Customer;

import java.util.List;

public interface CategoryService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
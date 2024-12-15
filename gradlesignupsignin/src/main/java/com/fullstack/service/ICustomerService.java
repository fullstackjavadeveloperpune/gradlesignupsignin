package com.fullstack.service;

import com.fullstack.model.Customer;

public interface ICustomerService {

    Customer signUp(Customer customer);

    boolean signIn(String custEmailId, String custPassword);
}

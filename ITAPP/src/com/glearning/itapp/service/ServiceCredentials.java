package com.glearning.itapp.service;

import com.glearning.itapp.model.Employee;

public interface ServiceCredentials {

    String generateEmailAddress(String employeeName, String employeeLastname, String department);
    String generatePassword(int maxLength);
    void displayCredential(Employee employee);

}

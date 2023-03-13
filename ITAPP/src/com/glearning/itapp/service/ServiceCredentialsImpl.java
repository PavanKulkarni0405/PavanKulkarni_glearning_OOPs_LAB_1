package com.glearning.itapp.service;

import com.glearning.itapp.model.Employee;

public class ServiceCredentialsImpl implements ServiceCredentials {
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBER = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()_";
    private static final String PASSWORD_ALLOW_BASE = UPPER_CASE + LOWER_CASE + NUMBER + SPECIAL_CHARS;

    @Override
    public String generateEmailAddress(String employeeName, String employeeLastname, String emailAddress) {
        return employeeName + employeeLastname + "@" + emailAddress + ".abc.com";
    }

    @Override
    public String generatePassword(int maxLength) {
        StringBuilder sb = new StringBuilder(maxLength);

        for (int i = 0; i < maxLength; i++) {
            int index = (int) ((PASSWORD_ALLOW_BASE.length()) * Math.random());

            sb.append((PASSWORD_ALLOW_BASE.charAt(index)));
        }
        return sb.toString();

    }

    @Override
    public void  displayCredential(Employee employee) {

        System.out.println("Dear "+employee.getEmployeeName()+ " your generated credentials are as follows ");
        System.out.println("Email\t\t"+ employee.getEmailAddress());
        System.out.println("Password\t"+employee.getPassword());

    }
}

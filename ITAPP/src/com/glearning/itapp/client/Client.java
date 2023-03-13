package com.glearning.itapp.client;

import com.glearning.itapp.model.Employee;
import com.glearning.itapp.service.ServiceCredentials;
import com.glearning.itapp.service.ServiceCredentialsImpl;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Employee employee = new Employee("Pavan", "Kulkarni");
        ServiceCredentials serviceCredentials = new ServiceCredentialsImpl();

        System.out.println("Please enter the department from the following ");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        Scanner sc = new Scanner(System.in);
        int option  = sc.nextInt();

        switch (option){
            case 1:{
                String generatedEmail = serviceCredentials.generateEmailAddress(employee.getEmployeeName().toLowerCase(), employee.getEmployeeLastName().toLowerCase(), "tech");
                String generatedPassword = serviceCredentials.generatePassword(12);
                employee.setEmailAddress(generatedEmail);
                employee.setPassword(generatedPassword);
                serviceCredentials.displayCredential(employee);
                break;
            }
            case 2 :{
                String generatedEmail = serviceCredentials.generateEmailAddress(employee.getEmployeeName().toLowerCase(), employee.getEmployeeLastName().toLowerCase(), "adm");
                String generatedPassword = serviceCredentials.generatePassword(12);
                employee.setEmailAddress(generatedEmail);
                employee.setPassword(generatedPassword);
                serviceCredentials.displayCredential(employee);
                break;

            }

            case 3:{
                String generatedEmail = serviceCredentials.generateEmailAddress(employee.getEmployeeName().toLowerCase(), employee.getEmployeeLastName().toLowerCase(), "hr");
                String generatedPassword = serviceCredentials.generatePassword(12);
                employee.setEmailAddress(generatedEmail);
                employee.setPassword(generatedPassword);
                serviceCredentials.displayCredential(employee);

                break;
            }
            case 4:{
                String generatedEmail = serviceCredentials.generateEmailAddress(employee.getEmployeeName().toLowerCase(), employee.getEmployeeLastName().toLowerCase(), "legal");
                String generatedPassword = serviceCredentials.generatePassword(12);
                employee.setEmailAddress(generatedEmail);
                employee.setPassword(generatedPassword);
                serviceCredentials.displayCredential(employee);
                break;

            }
        }


    }


}

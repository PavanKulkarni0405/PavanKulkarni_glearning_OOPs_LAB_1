package com.glearning.itapp.model;

public class Employee {
   private String employeeName;
   private String employeeLastName;
   private String emailAddress;
   private String password;
   private String department;

   public Employee(String employeeName, String employeeLastName){
       this.employeeName = employeeName;
       this.employeeLastName =  employeeLastName;

   }

    public Employee(String employeeName, String employeeLastName, String emailAddress) {
        this.employeeName = employeeName;
        this.employeeLastName = employeeLastName;
        this.emailAddress = emailAddress;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDepartment(String company) {
        this.department = company;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", company='" + department + '\'' +
                '}';
    }
}



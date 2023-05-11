package com.jswone.entity;

public class EmployeeReq {
    String name;
    String job;

    public EmployeeReq() {
    }

    public EmployeeReq(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

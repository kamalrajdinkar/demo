package com.jswone.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.Instant;
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeRes {
    //{"name":"morpheus","job":"leader","id":"922","createdAt":"2023-05-03T05:20:15.887Z"}

    String name;
    String job;
    int id;
    Instant createdAt;

    public EmployeeRes() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "EmployeeRes{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", id=" + id +
                ", createdAt=" + createdAt +
                '}';
    }
}

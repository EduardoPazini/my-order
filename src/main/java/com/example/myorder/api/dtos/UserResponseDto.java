package com.example.myorder.api.dtos;

public class UserResponseDto {

    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String address;

    public Integer getId() {
        return id;
    }

    public UserResponseDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserResponseDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserResponseDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserResponseDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserResponseDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserResponseDto setAddress(String address) {
        this.address = address;
        return this;
    }
}

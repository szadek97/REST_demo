package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.User;


public interface IUserService {
    User getById(Long id);
}

package com.example.dagashiallergendatabase.service;

import com.example.dagashiallergendatabase.entity.Snack;

import java.util.List;

public interface SnackService {
    List<Snack> findAll();

    Snack findById(Integer id);

    //void create(String name);

    //void update(int id, String name) throws Exception;
}

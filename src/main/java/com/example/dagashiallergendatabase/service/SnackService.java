package com.example.dagashiallergendatabase.service;

import com.example.dagashiallergendatabase.entity.Snack;

import java.util.List;
import java.util.Optional;

public interface SnackService {
  List<Snack> findAll();

  Optional<Snack> findById(Integer id);

  //void create(String name);

  //void update(int id, String name) throws Exception;
}

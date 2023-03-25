package com.example.dagashiallergendatabase.service;

import com.example.dagashiallergendatabase.entity.Snack;
import com.example.dagashiallergendatabase.mapper.SnackMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SnackServiceImpl implements SnackService {
  private final SnackMapper snackMapper;

  public SnackServiceImpl(SnackMapper snackMapper) {
    this.snackMapper = snackMapper;
  }

  public List<Snack> findAll() {
    return snackMapper.findAll();
  }

  public Optional<Snack> findById(Integer id) {
    return snackMapper.findById(id);
  }
}

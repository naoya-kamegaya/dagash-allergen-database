package com.example.dagashiallergendatabase.service;

import com.example.dagashiallergendatabase.entity.Snack;
import com.example.dagashiallergendatabase.exception.ResourceNotFoundException;
import com.example.dagashiallergendatabase.mapper.SnackMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SnackServiceImpl implements SnackService {
  private final SnackMapper snackMapper;

  public SnackServiceImpl(SnackMapper snackMapper) {
    this.snackMapper = snackMapper;
  }

  public List<Snack> findAll() {
    return snackMapper.findAll();
  }

  public Snack findById(Integer id) {
    return snackMapper.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("resource not found"));
  }
}

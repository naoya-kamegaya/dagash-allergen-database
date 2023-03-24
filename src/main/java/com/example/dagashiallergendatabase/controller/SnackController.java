package com.example.dagashiallergendatabase.controller;

import com.example.dagashiallergendatabase.service.SnackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SnackController {
  private final SnackService snackService;

  public SnackController(SnackService snackService) {
    this.snackService = snackService;
  }

  @GetMapping("/snacks")
  public List<String> snacks(@RequestParam(required = false) Integer id) {
    return snackService
            .findById(id).stream().map(SnackResponse::new).map(SnackResponse::getName).toList();
  }
}

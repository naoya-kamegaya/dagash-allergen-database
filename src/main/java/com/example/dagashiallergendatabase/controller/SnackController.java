package com.example.dagashiallergendatabase.controller;

import com.example.dagashiallergendatabase.entity.Snack;
import com.example.dagashiallergendatabase.exception.ResourceNotFoundException;
import com.example.dagashiallergendatabase.service.SnackService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class SnackController {
  private final SnackService snackService;

  public SnackController(SnackService snackService) {
    this.snackService = snackService;
  }

  @GetMapping("/snacks")
  public List<String> snacks() {
    return snackService
            .findAll().stream().map(SnackResponse::new).map(SnackResponse::getName).toList();
  }

  @GetMapping("/snacks/{id}")
  public Snack findById(@PathVariable("id") Integer id) {
    return snackService.findById(id);
  }
  
  @ExceptionHandler(value = ResourceNotFoundException.class)

  public ResponseEntity<Map<String, String>> handleNoResourceFound(
          ResourceNotFoundException e, HttpServletRequest request) {
    Map<String, String> body = Map.of(
            "timestamp", ZonedDateTime.now().toString(),
            "status", String.valueOf(HttpStatus.NOT_FOUND.value()),
            "error", HttpStatus.NOT_FOUND.getReasonPhrase(),
            "message", e.getMessage(),
            "path", request.getRequestURI());

    return new ResponseEntity(body, HttpStatus.NOT_FOUND);
  }
}

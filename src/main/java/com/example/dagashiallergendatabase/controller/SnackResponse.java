package com.example.dagashiallergendatabase.controller;

import com.example.dagashiallergendatabase.entity.Snack;

public class SnackResponse {
  private String name;

  public SnackResponse(Snack snack) {
    this.name = snack.getName();
  }

  public String getName() {
    return name;
  }
}

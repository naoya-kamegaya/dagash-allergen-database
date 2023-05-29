package com.example.dagashiallergendatabase.entity;

import java.sql.Date;

public class Snack {
  private Integer id;
  private String name;
  private boolean containsShrimps;
  private boolean containsCrabs;
  private boolean containsWheat;
  private boolean containsBuckwheat;
  private boolean containsEggs;
  private boolean containsMilk;
  private boolean containsPeanuts;
  private Date updatedAt;

  public Snack(
          Integer id,
          String name,
          boolean containsShrimps,
          boolean containsCrabs,
          boolean containsWheat,
          boolean containsBuckwheat,
          boolean containsEggs,
          boolean containsMilk,
          boolean containsPeanuts,
          Date updatedAt
  ) {
    this.id = id;
    this.name = name;
    this.containsShrimps = containsShrimps;
    this.containsCrabs = containsCrabs;
    this.containsWheat = containsWheat;
    this.containsBuckwheat = containsBuckwheat;
    this.containsEggs = containsEggs;
    this.containsMilk = containsMilk;
    this.containsPeanuts = containsPeanuts;
    this.updatedAt = updatedAt;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public boolean isContainsShrimps() {
    return containsShrimps;
  }

  public boolean isContainsCrabs() {
    return containsCrabs;
  }

  public boolean isContainsWheat() {
    return containsWheat;
  }

  public boolean isContainsBuckwheat() {
    return containsBuckwheat;
  }

  public boolean isContainsEggs() {
    return containsEggs;
  }

  public boolean isContainsMilk() {
    return containsMilk;
  }

  public boolean isContainsPeanuts() {
    return containsPeanuts;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }
}

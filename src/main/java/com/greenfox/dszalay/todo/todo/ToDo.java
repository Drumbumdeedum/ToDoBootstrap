package com.greenfox.dszalay.todo.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;

  public ToDo() {}

  public ToDo(String title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setDone(boolean done) {
    isDone = done;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public long getId() {
    return id;
  }

  public boolean isDone() {
    return isDone;
  }

  public boolean isUrgent() {
    return isUrgent;
  }
}

package edu.cnm.deepdive.data_model_ex.model.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Contact {

  @PrimaryKey
  private long id;

  private String lastName;

  private String firstName;

  private String middleName;

  private String phoneNumber;

  private String smsNumber;

  private String email;

}

package edu.cnm.deepdive.data_model_ex.model.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = @Index(value = {"last_name","first_name","middle_name"},unique = true))
public class Contact {

  @PrimaryKey
  @ColumnInfo(name = "contact_id")
  private long id;

  @NonNull
  @ColumnInfo(name = "last_name")
  private String lastName;

  @NonNull
  @ColumnInfo(name = "first_name")
  private String firstName;

  @Nullable
  @ColumnInfo(name = "middle_name")
  private String middleName;

  @NonNull
  @ColumnInfo(name = "phone_number")
  private String phoneNumber;

  @Nullable
  @ColumnInfo(name = "sms_number")
  private String smsNumber;

  @Nullable
  @ColumnInfo(name = "email")
  private String email;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @NonNull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@NonNull String lastName) {
    this.lastName = lastName;
  }

  @NonNull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@NonNull String firstName) {
    this.firstName = firstName;
  }

  @Nullable
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(@Nullable String middleName) {
    this.middleName = middleName;
  }

  @NonNull
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(@NonNull String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Nullable
  public String getSmsNumber() {
    return smsNumber;
  }

  public void setSmsNumber(@Nullable String smsNumber) {
    this.smsNumber = smsNumber;
  }

  @Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@Nullable String email) {
    this.email = email;
  }
}

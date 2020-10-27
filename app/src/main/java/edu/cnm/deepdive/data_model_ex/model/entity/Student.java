package edu.cnm.deepdive.data_model_ex.model.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import java.time.LocalDate;

@Entity(indices = {
    @Index(value = "enrolled"),
    @Index(value = "disenrolled"),
    @Index(value = {"last_name","first_name","middle_name"},unique = true),
    @Index(value = {"student_number"},unique = true)
})
public class Student {


  @PrimaryKey
  @ColumnInfo(name = "student_id")
  private long id;

  @NonNull
  @ColumnInfo(name = "student_id")
  private String studentNumber;

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
  @ColumnInfo(name = "enrolled")
  private LocalDate enrolled;

  @Nullable
  @ColumnInfo(name = "disenrolld")
  private LocalDate disenrolled;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @NonNull
  public String getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(@NonNull String studentNumber) {
    this.studentNumber = studentNumber;
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

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  @NonNull
  public LocalDate getEnrolled() {
    return enrolled;
  }

  public void setEnrolled(@NonNull LocalDate enrolled) {
    this.enrolled = enrolled;
  }

  public LocalDate getDisenrolled() {
    return disenrolled;
  }

  public void setDisenrolled(LocalDate disenrolled) {
    this.disenrolled = disenrolled;
  }
}

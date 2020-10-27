package edu.cnm.deepdive.data_model_ex.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import edu.cnm.deepdive.data_model_ex.model.entity.StudentContact.RelationshipType;

@TypeConverters(RelationshipType.class)
@Entity(
    primaryKeys = {"student_id", "contact_id"},
    foreignKeys = {
        @ForeignKey(entity = Contact.class, parentColumns = "student_id", childColumns = "student_id",
            onDelete = ForeignKey.CASCADE, onUpdate = ForeignKey.CASCADE),
        @ForeignKey(entity = Student.class, parentColumns = "contact_id", childColumns = "contact_id",
            onDelete = ForeignKey.CASCADE, onUpdate = ForeignKey.CASCADE)
    },
    indices =
        @Index(value = "relationship_type")
)

  public class StudentContact {
  @PrimaryKey
  @ColumnInfo(name = "student_contact_id")
  private long id;

  @ColumnInfo(name = "student_id", index = true)
  private long studentId;

  @ColumnInfo(name = "contact_id", index = true)
  private long contactId;

  @ColumnInfo(name = "primary")
  private boolean primary;


  @ColumnInfo(name = "relationship_type")
  private RelationshipType relationshipType;



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }

  public long getContactId() {
    return contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public boolean isPrimary() {
    return primary;
  }

  public void setPrimary(boolean primary) {
    this.primary = primary;
  }

  public RelationshipType getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(
      RelationshipType relationshipType) {
    this.relationshipType = relationshipType;
  }
  @TypeConverter
  public String enumToString(Enum value) {
    return (value!= null ) ? value.toString(): null;
  }
  @TypeConverter
  public RelationshipType stringToRelationshipType(String name) {
    return (name != null) ? RelationshipType.valueOf(name) : null;
  }

  public enum RelationshipType {
    PARENT,
    GUARDIAN,
    SIBLING,
    OTHER
  }
}

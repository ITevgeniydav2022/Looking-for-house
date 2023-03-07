package ru.team2.lookingforhouse.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity(name = "userDataTable")
@Data
public class User {
    @Id
    private Long id;
    private  String firstName;
    private  String lastName;
    private  String userName;
    private Timestamp registeredAt;
}

package ru.team2.lookingforhouse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.team2.lookingforhouse.util.StatusAttributeConverter;
import ru.team2.lookingforhouse.util.UserStatus;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "UserDog")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDog {
    @Id
    private Long chatId;
    private String firstName;
    private String lastName;
    private String userName;
    private String phoneNumber;
    private LocalDateTime registeredAt;
    @Column(name = "is_dog")
    private boolean isDog;

    @Convert(converter = StatusAttributeConverter.class)
    private UserStatus userStatus;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userDog", fetch = FetchType.EAGER)
    private List<ReportDog> reports;

    public boolean isDog() {
        return isDog;
    }
}

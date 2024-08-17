package ReferencesProject.MODULES.USERS.Entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "\"UserState\"")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserStateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_UserState")
    private Long idUserState;

    @Column(name = "Name_UserState")
    @Nonnull
    private String nameUserState;

}

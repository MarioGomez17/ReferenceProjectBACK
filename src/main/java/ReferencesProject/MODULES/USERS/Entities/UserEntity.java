package ReferencesProject.MODULES.USERS.Entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "\"User\"")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_User")
    private Long idUser;

    @Column(name = "Name_User")
    @Nonnull
    private String nameUser;

    @Column(name = "LastName_User")
    @Nonnull
    private String lastNameUser;

    @Column(name = "UserName_User")
    @Nonnull
    private String userNameUser;

    @Column(name = "Email_User")
    @Nonnull
    private String emailUser;

    @Column(name = "Password_User")
    @Nonnull
    private String passwordUser;

    @Column(name = "RegisterDate_User")
    @Nonnull
    private String registerDateUser;

    @Column(name = "Requests_User")
    @Nonnull
    private String requestsUser;

    @ManyToOne
    @JoinColumn(name = "Role_User")
    private RoleEntity idRoleUser;

    @ManyToOne
    @JoinColumn(name = "UserState_User")
    private UserStateEntity idUserStateUser;
}

package ReferencesProject.MODULES.USERS.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "\"Permission\"")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PermissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Permission")
    private Long idPermission;

    @Column(name = "Name_Permission")
    @Nonnull
    private String namePermission;

    @Column(name = "URL_Permission")
    @Nonnull
    private String urlPermission;

    @Column(name = "HttpMethod_Permission")
    @Nonnull
    private String httpMethodPermission;

    @Column(name = "Description_Permission")
    @Nonnull
    private String descriptionPermission;

    @ManyToMany(mappedBy = "permissionsRole")
    public List<RoleEntity> rolesPermission = new ArrayList<>();
}

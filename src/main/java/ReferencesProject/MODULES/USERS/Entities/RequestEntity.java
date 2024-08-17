package ReferencesProject.MODULES.USERS.Entities;

import ReferencesProject.MODULES.SPARE_PARTS.Entities.ReferenceSparePartEntity;
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
@Table(name = "\"Request\"")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Request")
    private Long idRequest;

    @Column(name = "Date_Request")
    @Nonnull
    private String dateRequest;

    @ManyToOne
    @JoinColumn(name = "User_Request")
    private UserEntity userRequest;

    @ManyToOne
    @JoinColumn(name = "ReferenceSparePart_Request")
    private ReferenceSparePartEntity referenceSparePartRequest;

    @Column(name = "NewValue_Request")
    @Nonnull
    private String newValueRequest;

    @Column(name = "Description_Request")
    @Nonnull
    private String descriptionRequest;
}

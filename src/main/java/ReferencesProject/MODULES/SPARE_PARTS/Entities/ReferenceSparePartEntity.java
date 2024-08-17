package ReferencesProject.MODULES.SPARE_PARTS.Entities;

import ReferencesProject.MODULES.USERS.Entities.UserEntity;
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
@Table(name = "Reference_Spare_Part")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReferenceSparePartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_ReferenceSparePart")
    private Long idReferenceSparePart;

    @Column(name = "Value_ReferenceSparePart")
    @Nonnull
    private String valueReferenceSparePart;

    @Column(name = "UpdateDate_ReferenceSparePart")
    @Nonnull
    private String updateDateReferenceSparePart;

    @ManyToOne
    @JoinColumn(name = "SparePart_ReferenceSparePart")
    private SparePartEntity sparePartReferenceSparePart;

    @ManyToOne
    @JoinColumn(name = "User_ReferenceSparePart")
    private UserEntity userReferenceSparePart;
}

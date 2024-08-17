package ReferencesProject.MODULES.MOTORCYCLES.Entities;

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
@Table(name = "CylinderCapacity")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CylinderCapacityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_CylinderCapacity")
    private Long idCylinderCapacity;

    @Column(name = "value_CylinderCapacity")
    @Nonnull
    private int valueCylinderCapacity;
}

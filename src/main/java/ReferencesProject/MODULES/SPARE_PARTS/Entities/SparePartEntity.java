package ReferencesProject.MODULES.SPARE_PARTS.Entities;

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
@Table(name = "Spare_Part")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SparePartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_SparePart")
    private Long idSparePart;

    @Column(name = "Name_SparePart")
    @Nonnull
    private String nameSparePart;

    @ManyToOne
    @JoinColumn(name = "MotorcyclePart_SparePart")
    private MotorcyclePartEntity motorcyclePartSparePart;
}

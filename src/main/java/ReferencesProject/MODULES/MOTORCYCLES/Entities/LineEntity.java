package ReferencesProject.MODULES.MOTORCYCLES.Entities;

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
@Table(name = "Line")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Line")
    private Long id;

    @Column(name = "Name_Line")
    @Nonnull
    private String nameLine;

    @ManyToOne
    @JoinColumn(name = "Brand_Line")
    private BrandEntity idBrand;

    @ManyToOne
    @JoinColumn(name = "CylinderCapacity_Line")
    private CylinderCapacityEntity id_CylinderCapacity;

}

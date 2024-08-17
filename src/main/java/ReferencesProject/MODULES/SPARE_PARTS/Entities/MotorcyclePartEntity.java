package ReferencesProject.MODULES.SPARE_PARTS.Entities;

import ReferencesProject.MODULES.MOTORCYCLES.Entities.LineEntity;
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
@Table(name = "Motorcycle_Part")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MotorcyclePartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_MotorcyclePart")
    private Long idMotorcyclePart;

    @Column(name = "Name_MotorcyclePart")
    @Nonnull
    private String nameMotorcyclePart;

    @ManyToOne
    @JoinColumn(name = "Line_MotorcyclePart")
    private LineEntity lineMotorcyclePart;
}

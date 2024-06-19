package ma.xproce.pfaecom.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Paiement")
public class Paiement {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @Column(name = "numeroCompte")
    private Integer numeroCompte;
    @Column(name = "montant")
    private double montant;
    @Column(name = "datePaiement")
    private LocalDate datePaiement;
    @Column(name = "methode")
    private String methode;
    //    @OneToOne
//    private Panier panier;
}

package ma.xproce.pfaecom.dao.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Client")
public class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "age")
    private Integer age;
    @Column(name = "mail")
    private String mail;
    @Column(name = "telephone")
    private Integer telephone;
    @Column(name = "nomComplet")
    private String nomComplet;
    @Column(name = "adresse")
    private String adresse;
    @Enumerated(EnumType.STRING)
    private Role role;
//    @OneToOne
//    private Panier panier;
}

package ma.xproce.pfaecom.dao.repositories;

import jakarta.transaction.Transactional;
import ma.xproce.pfaecom.dao.entities.Client;
import ma.xproce.pfaecom.dao.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional

public interface PaiementRepository extends JpaRepository<Paiement,Integer> {
}

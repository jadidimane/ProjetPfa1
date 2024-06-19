package ma.xproce.pfaecom.dao.repositories;

import jakarta.transaction.Transactional;
import ma.xproce.pfaecom.dao.entities.Visiteur;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional

public interface VisiteurRepository extends JpaRepository<Visiteur,Integer> {
}

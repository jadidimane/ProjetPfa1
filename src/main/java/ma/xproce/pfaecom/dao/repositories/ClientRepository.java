package ma.xproce.pfaecom.dao.repositories;

import jakarta.transaction.Transactional;
import ma.xproce.pfaecom.dao.entities.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@Transactional

public interface ClientRepository extends JpaRepository<Client,Integer > {
    public Client findByUsername(String username);
}

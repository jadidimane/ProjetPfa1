package ma.xproce.pfaecom.service;

import lombok.AllArgsConstructor;
import ma.xproce.pfaecom.dao.entities.Client;
import ma.xproce.pfaecom.dao.entities.Role;
import ma.xproce.pfaecom.dao.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ClientService implements ClientManager{
    @Autowired
    ClientRepository clientRepository;
    @Override
    public Client addClient(Client client) {
        if(client.getAge()>18){
            client.setRole(Role.CLIENT);
            //client.setPanier(new Panier());
            return clientRepository.save(client);
        }
        return null;
    }

    @Override
    public Client updateClient(Client client) {
        Client client_=clientRepository.findById(client.getId()).orElse(null);
        if(client_!=null && client.getAge()>18 ){

            client_.setUsername(client.getUsername());
            client_.setPassword(client.getPassword());
            client_.setAge(client.getAge());
            client_.setMail(client.getMail());
            client_.setTelephone(client.getTelephone());
            client_.setNomComplet(client.getNomComplet());
            client_.setAdresse(client.getAdresse());
            client_.setRole(Role.CLIENT);
//            client_.setPanier(client.getPanier());
//            client.getPanier.setClient(client_);
            return clientRepository.save(client_);
        }
        return null;
    }

    @Override
    public Boolean deleteClient(Client client) {
        if (clientRepository.existsById(client.getId())) {
            Client e = clientRepository.findById(client.getId()).orElse(null);
            if (e != null) {
                //panierRepository.delete(client.getPanier());
                clientRepository.delete(client);
                return true;
            }

        }
        return false;

    }
    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Integer id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client getClientByUsername(String username) {
        return clientRepository.findByUsername(username);
    }
}

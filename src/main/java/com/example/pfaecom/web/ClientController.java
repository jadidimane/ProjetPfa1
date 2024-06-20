package ma.xproce.pfaecom.web;

import ma.xproce.pfaecom.service.ClientManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class ClientController {
    @Autowired
    ClientManager clientManager;

}

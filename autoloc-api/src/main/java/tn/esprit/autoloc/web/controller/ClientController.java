package tn.esprit.autoloc.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.service.ClientService;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.service.IClientService;

@RestController
@AllArgsConstructor
public class ClientController {
    IClientService cs;
}

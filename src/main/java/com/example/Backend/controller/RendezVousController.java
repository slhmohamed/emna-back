package com.example.Backend.controller;

import com.example.Backend.models.RendezVous;
import com.example.Backend.service.RendeVousService;
import com.example.Backend.service.impl.RendezVousServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rendez-vous")
@CrossOrigin(origins = "http://localhost:4200")
public class RendezVousController {
    @Autowired
    private RendeVousService rendeVousService;

    @PostMapping("/createRendezVous")
    public RendezVous createRendezVous(@RequestBody RendezVous rendezVous)throws Exception{

        return this.rendeVousService.createRandezVous((rendezVous));
    }

}

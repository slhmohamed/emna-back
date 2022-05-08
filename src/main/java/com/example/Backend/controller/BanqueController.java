package com.example.Backend.controller;

import com.example.Backend.models.Banque;
import com.example.Backend.service.BanqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banque")
@CrossOrigin(origins = "http://localhost:4200")
public class BanqueController {
    @Autowired
    private BanqueService banqueService;

    @PostMapping("/addBanque")
    public Banque createBanque(@RequestBody Banque banque) throws Exception{
        return this.banqueService.createBanque(banque);

    }
    @GetMapping("/getAllBanque")
    public List<Banque> listUser(){
        List<Banque> list=this.banqueService.list();
        return list;
    }
}

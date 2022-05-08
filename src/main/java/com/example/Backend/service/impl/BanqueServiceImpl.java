package com.example.Backend.service.impl;

import com.example.Backend.models.Banque;
import com.example.Backend.models.RendezVous;
import com.example.Backend.models.User;
import com.example.Backend.repo.BanqueRepository;
import com.example.Backend.repo.RendezVousRepository;
import com.example.Backend.service.BanqueService;
import com.example.Backend.service.RendeVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BanqueServiceImpl implements BanqueService {
    @Autowired
    private BanqueRepository banqueRepository;

    @Override
    public Banque createBanque(Banque banque) throws Exception {
        return this.banqueRepository.save(banque);
    }

    @Override
    public List<Banque> list() {
        return this.banqueRepository.findAll();
    }
}

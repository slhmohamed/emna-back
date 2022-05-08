package com.example.Backend.service.impl;

import com.example.Backend.models.RendezVous;
import com.example.Backend.repo.RendezVousRepository;
import com.example.Backend.service.RendeVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RendezVousServiceImpl implements RendeVousService {
    @Autowired
    private RendezVousRepository rendezVousRepository;
    @Override
    public RendezVous createRandezVous(RendezVous rendezVous) throws Exception {
       return this.rendezVousRepository.save(rendezVous);
    }
}

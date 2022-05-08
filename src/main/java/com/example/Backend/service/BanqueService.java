package com.example.Backend.service;

import com.example.Backend.models.Banque;
import com.example.Backend.models.User;
import com.example.Backend.models.UserRole;

import java.util.List;
import java.util.Set;

public interface BanqueService {

    public Banque createBanque(Banque banque) throws Exception;
    public List<Banque> list();

}

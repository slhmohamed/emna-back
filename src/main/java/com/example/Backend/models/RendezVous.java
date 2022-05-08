package com.example.Backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RendezVous {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private Date date;
    @OneToOne
    private User user;
    @OneToOne
    private Banque banque;

}

package com.Parking.GestionParking.repository;

import com.Parking.GestionParking.entities.Reclamation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IReclamationRepository extends CrudRepository<Reclamation,Integer> {
    List<Reclamation> findByEmail(String email);

}

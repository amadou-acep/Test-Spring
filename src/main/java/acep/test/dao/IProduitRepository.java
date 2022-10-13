package acep.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import acep.test.entities.ProduitEntity;

public interface IProduitRepository extends JpaRepository<ProduitEntity, Integer> {
    
}

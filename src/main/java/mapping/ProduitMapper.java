package mapping;


import org.mapstruct.Mapper;

import acep.test.dto.Produit;
import acep.test.entities.ProduitEntity;

@Mapper
public interface ProduitMapper {
	   Produit toProduit(ProduitEntity produitEntity);
	   ProduitEntity fromProduit(Produit produit);
}

package acep.test.dto;


import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {


	private int id;
	
	@NotNull
	private String nom ;
	
	@NotNull
	private double qtStock;
	
	@NotNull
	private int prix;
	
	@NotNull
	private int categorie;

}

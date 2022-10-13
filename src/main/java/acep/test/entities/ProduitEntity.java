package acep.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "produits")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProduitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 200)
	private String nom ;
	
	@Column(nullable = false, length = 200)
	private double qtStock;
	
	@Column(nullable = false, length = 200)
	private int prix;
	
	@Column(nullable = false, length = 200)
	private int categorie;
	
	@ManyToOne
	private AppUserEntity appUser;
}

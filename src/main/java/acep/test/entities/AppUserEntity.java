package acep.test.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class AppUserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 150)
	private String nom;
	
	@Column(nullable = false, length = 200)
	private String prenom;
	
	@Column(nullable = false, length = 200)
	private String email;
	
	@Column(nullable = false, length = 200)
	private String password;
	
	@Column(nullable = false, length = 200)
	private int etat;
	
	@ManyToMany()
	private List<AppRolesEntity> appRoles;
	
	@OneToMany(mappedBy = "appUser")
	private List<ProduitEntity> produits;
}

package acep.test.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

	private int id;
	
	@NotNull(message = "Le nom ne doit pas etre nul ")
	private String nom;
	
	@NotNull(message = "Le prenom ne doit pas etre nul ")
	private String prenom;
	
	@NotNull(message = "L'email ne doit pas etre nul ")
	private String email;
	
	@NotNull(message = "Le mot de passe ne doit pas etre nul ")
	private String password;
	
	@NotNull(message = "L'etat ne doit pas etre nul ")
	private int etat;
	
}

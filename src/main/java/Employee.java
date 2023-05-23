import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String role;
	
	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if(name.isEmpty()) throw new Exception ("il nome è vuoto");
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) throws Exception {
		if(surname.isEmpty()) throw new Exception ("il cognome è vuoto");
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) throws Exception{
		if(LocalDate.now().isBefore(dateOfBirth)) throw new Exception ("La data di nascita non è valida");
		this.dateOfBirth = dateOfBirth;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) throws Exception {

		List<String> acceptedRoles = new ArrayList<>();
		acceptedRoles.add("employee");
		acceptedRoles.add("boss");
		if(!acceptedRoles.contains(role.toLowerCase())) throw new Exception ("Ruolo inesistente");
		this.role = role;
	}
	
	
	
}

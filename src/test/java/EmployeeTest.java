import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.time.LocalDate;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EmployeeTest {
	
	final String[] names = {"mario", "", "luigi", "pino", "ciccio"};
	final String[] surnames = {"rossi", "verdi", "", "bianchi"};
	final String[] dates = {"1989-04-23", "1992-06-22", "2024-05-25", "2023-09-02"};
	final String[] roles = {"employee", "boss", "director"};
	Random rnd = new Random();
	
	public Employee employee = new Employee();
	
	@RepeatedTest(10)
	public void setNameTest() throws Exception {
		int index = rnd.nextInt(names.length);
		assumeFalse(names[index].isEmpty());
		assertDoesNotThrow(() -> {
			employee.setName(names[index]);
        });
		
	}
	
	@RepeatedTest(10)
	public void setNameExcTest() throws Exception {
		int index = rnd.nextInt(names.length);
		assumeTrue(names[index].isEmpty());
		assertThrows(Exception.class, () -> {
			employee.setName(names[index]);
        });
		
	}
	
	@RepeatedTest(10)
	public void setSurnameTest() throws Exception {
		int index = rnd.nextInt(surnames.length);
		assumeFalse(surnames[index].isEmpty());
		assertDoesNotThrow(() -> {
			employee.setSurname(surnames[index]);
        });
		
	}
	
	@RepeatedTest(10)
	public void setSurnameExcTest() throws Exception {
		int index = rnd.nextInt(surnames.length);
		assumeTrue(surnames[index].isEmpty());
		assertThrows(Exception.class, () -> {
			employee.setSurname(surnames[index]);
        });
		
	}
	
	@RepeatedTest(10)
	public void setDateOfBirthTest() throws Exception {
		int index = rnd.nextInt(dates.length);
		assumeFalse(LocalDate.now().isBefore(LocalDate.parse(dates[index])));
		assertDoesNotThrow(() -> {
			employee.setDateOfBirth(LocalDate.parse(dates[index]));
        });
		
	}
	
	@RepeatedTest(10)
	public void setDateOfBirthExcTest() throws Exception {
		int index = rnd.nextInt(dates.length);
		assumeTrue(LocalDate.now().isBefore(LocalDate.parse(dates[index])));
		assertThrows(Exception.class, () -> {
			employee.setDateOfBirth(LocalDate.parse(dates[index]));
        });
		
	}
	
	
	@RepeatedTest(10)
	public void setRoleTest() throws Exception {
		int index = rnd.nextInt(roles.length);
		assumeFalse(roles[index].equals("director"));
		assertDoesNotThrow(() -> {
			employee.setRole(roles[index]);
        });
		
	}
	
	@RepeatedTest(10)
	public void setRoleExcTest() throws Exception {
		int index = rnd.nextInt(roles.length);
		assumeTrue(roles[index].equals("director"));
		assertThrows(Exception.class, () -> {
			employee.setRole(roles[index]);
        });
		
	}
	
	

}

package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
	@Id // 1st time it will take a default number i.e., 0 but 2nd time it
		// throughs error
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// in signup page we only give name,email,phone.... but not giving id hence
	// it does not have values so,
	// this will generate id i.e., 1 2 3....
	int id;
	String name;
	String email;
	
	long mobile;
	String pass;
	String gender;
//in xml we have to add defination for each, but in html all tags are predefined
	/*
	 * hybernate provider
	 * in properties - add driver
	 *					add database
	 *					add username
	 *					add password
	 *		show sql- to execute query will be visible
	 *		everytime we execute it will update but if we write create in value 
	 *		thn everytime, executed it will be created in databse.
	 */
}
// the advantage of @Data is that when we change variable name here
// it will automatically change in getters and setters
// update project- alt+f5
//ctrl+shift+o will import everything.
//ctrl+shift+f will format.


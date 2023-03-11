package ru.team2.lookingforhouse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class of dogs
 * autor Tokan Ekaterina
 */

/** Replace class with a table in the database */
@Entity(name = "catDataTable")

/** Generates an all-args constructor. */
@AllArgsConstructor

/** Generate a constructor with no parameters. */
@NoArgsConstructor

/** Convenient shortcut annotation that bundles the features of
 * @ToString, @EqualsAndHashCode, @Getter/@Setter
 * and @RequiredArgsConstructor together
 */
@Data
public class Cat{

	/** Hibernate will look at the names and types of fields.*/
	@Id
	private Long id;


	/** "Breed" field */
	private String breed;

	/** "Name" field */
	private String name;

	/** "Year Of Birth" field */
	private int yearOfBirth;

	/** "Description" field */
	private String description;
}

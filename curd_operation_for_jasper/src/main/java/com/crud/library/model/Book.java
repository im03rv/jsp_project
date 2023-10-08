package com.crud.library.model;

 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // Constructor
@NoArgsConstructor // default
@ToString

@Entity
@Table(name = "book_table")
@Data // getter setter
public class Book {

	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_id;

	@Column(name = "book_name")
	private String book_name;

	@Column(name = "author")
	private String author;

	@Column(name = "price")
	private int price;

}

package com.devsuperior.UserDept.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table( name = "tb_User")
	public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String name;
	private String email;
	
	@ManyToOne // configuração de associação do ID. BD
	@JoinColumn(name = "departament_id") // Configurando nome da chave estrangeira para ligar ao BD
	private department Department;
	
	public User () {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public department getDepartment() {
		return Department;
	}

	public void setDepartment(department department) {
		Department = department;
	}
	
	
}

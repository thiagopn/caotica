package br.com.caotica.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Classe model de usuário
 * @author Thiago Pinheiro do Nascimento
**/
@Data
@Entity
@Table(name = "users")
public class User {
	
	/**
	 * Identificador de usuário
	**/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/**
	 * Nome de usuário
	**/
	@Column(length = 50, nullable = false)
	private String username;
	
	/**
	 * Senha de usuário
	**/
	@Column(columnDefinition = "char(60)", nullable = false)
	private String password;
	
	/**
	 * Indica se usuário está habilitado
	**/
	@Column(columnDefinition = "tinyint(1) default 1", nullable = false)
	private Boolean enabled;
	
	/**
	 * Autoridade de usuário
	**/
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "char(5)", nullable = false)
	private Authority authority;
}
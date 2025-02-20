package br.com.caotica.models;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Classe model de associado
 * @author Thiago Pinheiro do Nascimento
**/
@Data
@Entity
@Table(name = "associates")
public class Associate {
	
	/**
	 * Identificador de associado
	**/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	/**
	 * CPF de associado
	**/
	@Column(columnDefinition = "char(11)", nullable = false, updatable = false)
	private String cpf;
	
	/**
	 * Nome de associado
	**/
	@Column(length = 50, nullable = false)
	private String name;
	
	/**
	 * Nascimento de associado
	**/
	@Column(columnDefinition = "date", nullable = false)
	private Date birth;
	
	/**
	 * Gênero de associado
	**/
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "char(3)", nullable = false)
	private Gender gender;
	
	/**
	 * Associação entre endereço e associado
	**/
	@OneToOne(mappedBy = "associate", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Address address;
	
	/**
	 * Associação entre contato e associado
	**/
	@OneToOne(mappedBy = "associate", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Contact contact;
}
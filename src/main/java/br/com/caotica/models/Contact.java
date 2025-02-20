package br.com.caotica.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Classe model de contato
 * @author Thiago Pinheiro do Nascimento
**/
@Data
@Entity
@Table(name = "contacts")
public class Contact {

	/**
	 * Identificador de contato
	**/
	@Id
	@Column(name = "associates_id")
	private Long id;
	
	/**
	 * Celular de contato
	**/
	@Column(columnDefinition = "char(14)")
	private String cellphone;
	
	/**
	 * Telefone de contato
	**/
	@Column(columnDefinition = "char(13)")
	private String telephone;
	
	/**
	 * E-mail de contato
	**/
	@Column(length = 50, nullable = false)
	private String email;
	
	/**
	 * Associação entre associado e contato
	**/
	@OneToOne
	@MapsId
	@JoinColumn(name = "associates_id")
	private Associate associate;
}
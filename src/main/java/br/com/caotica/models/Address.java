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
 * Classe model de endereço
 * @author Thiago Pinheiro do Nascimento
**/
@Data
@Entity
@Table(name = "addresses")
public class Address {

	/**
	 * Identificador de endereço
	**/
	@Id
	@Column(name = "associates_id")
	private Long id;
	
	/**
	 * Logradouro de endereço
	**/
	@Column(length = 50, nullable = false)
	private String place;
	
	/**
	 * Complemento de endereço
	**/
	@Column(length = 50)
	private String complement;
	
	/**
	 * Bairro de endereço
	**/
	@Column(length = 50, nullable = false)
	private String district;
	
	/**
	 * Associação entre associado e endereço
	**/
	@OneToOne
	@MapsId
	@JoinColumn(name = "associates_id")
	private Associate associate;
}
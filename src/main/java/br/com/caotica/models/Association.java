package br.com.caotica.models;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Classe model de associação
 * @author Thiago Pinheiro do Nascimento
**/
@Data
@Entity
@Table(name = "associations")
public class Association {
	
	/**
	 * Identificador de associado
	**/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/**
	 * Data de registro de associação
	**/
	@Column(columnDefinition = "date", nullable =  false)
	private Date register;
	
	/**
	 * Data de início de associação
	**/
	@Column(columnDefinition = "date", nullable = false)
	private Date start;
	
	/**
	 * Data de término de associação
	**/
	@Column(columnDefinition = "date", nullable = false)
	private Date end;
	
	/**
	 * Valor de associação
	**/
	@Column(nullable = false)
	private BigDecimal amount;
	
	/**
	 * Tipo de associação
	**/
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "char(4)", nullable = false)
	private Type type;
	
	/**
	 * Associação entre associado e associação
	**/
	@ManyToOne
	@JoinColumn(name = "associates_id", nullable = false)
	private Associate associate;
}
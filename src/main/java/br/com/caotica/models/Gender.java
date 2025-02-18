package br.com.caotica.models;

import lombok.Getter;

/**
 * Enum de gênero
 * @author Thiago Pinheiro do Nascimento
**/
@Getter
public enum Gender {
	
	/**
	 * Gêneros disponíveis
	 * MAL - gênero masculino
	 * FEM - gênero feminino
	**/
	MAL("MAL", "Masculino"),
	FEM("FEM", "Feminino");
	
	/**
	 * Nome de gênero
	**/
	private String name;
	
	/**
	 * Descrição de gênero
	**/
	private String description;
	
	/**
	 * Construtor de gênero
	**/
	private Gender(String name, String description) {
		this.name = name;
		this.description = description;
	}
}
package br.com.caotica.models;

import lombok.Getter;

/**
 * Enum de autoridade
 * @author Thiago Pinheiro do Nascimento
**/
@Getter
public enum Authority {
	
	/**
	 * Autoridades disponíveis
	 * ADMIN - autoridade administrador
	 * INVIT - autoridade convidado
	**/
	ADMIN("ADMIN", "Administrador"),
	INVIT("INVIT", "Convidado");
	
	/**
	 * Nome de autoridade
	**/
	private String name;
	
	/**
	 * Descrição de autoridade
	**/
	private String description;
	
	/**
	 * Construtor de autoridade
	**/
	private Authority(String name, String description) {
		this.name = name;
		this.description = description;
	}
}
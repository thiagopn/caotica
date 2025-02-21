package br.com.caotica.models;

import lombok.Getter;

/**
 * Enum de tipo
 * @author Thiago Pinheiro do Nascimento
**/
@Getter
public enum Type {
	
	/**
	 * Tipos disponíveis
	 * INST - tipo professor
	 * STUD - tipo estudante
	 * TECH - tipo técnico
	**/
	INST("INST", "Professor"),
	STUD("STUD", "Estudante"),
	TECH("TECH", "Técnico");
	
	/**
	 * Nome de tipo
	**/
	private String name;
	
	/**
	 * Descrição de tipo
	**/
	private String description;
	
	/**
	 * Construtor de tipo
	**/
	private Type(String name, String description) {
		this.name = name;
		this.description = description;
	}
}
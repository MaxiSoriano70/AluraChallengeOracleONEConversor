package com.maxisoriano.conversores.modelo;

public class MonedaExtranjera {
	private String nombre;
	private float valor;
	
	public MonedaExtranjera(String nombre, float valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
}

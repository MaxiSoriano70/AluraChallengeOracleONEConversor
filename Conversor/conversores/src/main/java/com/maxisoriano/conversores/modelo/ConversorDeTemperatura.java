package com.maxisoriano.conversores.modelo;

public class ConversorDeTemperatura {
	private float temperatura;
	private float conversion;
	private boolean desicion;
	
	public ConversorDeTemperatura() {
		
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public boolean isDesicion() {
		return desicion;
	}

	public void setDesicion(boolean desicion) {
		this.desicion = desicion;
	}
	
	public float getConversion() {
		return conversion;
	}

	public void setConversion(float conversion) {
		this.conversion = conversion;
	}

	public float convetirTemperatura() {
		if(this.desicion==true) {
			this.conversion=(float) ((1.8*this.temperatura)+32);
			return this.conversion;
		}
		else {
			this.conversion=(float) ((this.temperatura-32)/1.8);
			return this.conversion;
		}
		
	}
}

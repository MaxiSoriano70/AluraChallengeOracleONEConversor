package com.maxisoriano.conversores.modelo;

import java.util.ArrayList;
import java.util.List;

public class ConversorDeMoneda {
	private static String monedaLocal;
	private float monto;
	private static List<MonedaExtranjera> listaMonedasExtranjeras = new ArrayList<>();
	
	public ConversorDeMoneda() {
	}
	
	static {
		MonedaExtranjera dolar=new MonedaExtranjera("Dolar",227.37F);
		MonedaExtranjera euro=new MonedaExtranjera("Euro", 248.71F);
		MonedaExtranjera libra=new MonedaExtranjera("Libra", 283.04F);
		MonedaExtranjera yen=new MonedaExtranjera("Yen", 1.67F);
		ConversorDeMoneda.listaMonedasExtranjeras.add(dolar);
		ConversorDeMoneda.listaMonedasExtranjeras.add(euro);
		ConversorDeMoneda.listaMonedasExtranjeras.add(libra);
		ConversorDeMoneda.listaMonedasExtranjeras.add(yen);
		ConversorDeMoneda.monedaLocal="Peso Argentino";
	}

	public String getMonedaLocal() {
		return monedaLocal;
	}

	public static void setMonedaLocal(String monedaLocal) {
		ConversorDeMoneda.monedaLocal = monedaLocal;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public List<MonedaExtranjera> getListaMonedasExtranjeras() {
		return ConversorDeMoneda.listaMonedasExtranjeras;
	}

	public static void setListaMonedasExtranjeras(List<MonedaExtranjera> listaMonedasExtranjeras) {
		ConversorDeMoneda.listaMonedasExtranjeras = listaMonedasExtranjeras;
	}
	
	public float CalcularValor(float monto,String nombreMoneda) {
		float valorCalculado=0;
		for(MonedaExtranjera moneda : this.getListaMonedasExtranjeras()) {
			if(nombreMoneda.equals(moneda.getNombre())) {
				valorCalculado=monto/moneda.getValor();
			}
		}
		return valorCalculado;
	}
	
	
	
	
	
	

}

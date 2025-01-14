package com.maxisoriano.conversores.accion;

import java.io.IOException;
import java.util.List;

import com.maxisoriano.conversores.modelo.ConversorDeMoneda;
import com.maxisoriano.conversores.modelo.MonedaExtranjera;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IndexConversorMoneda implements Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ConversorDeMoneda conversorDeMoneda=new ConversorDeMoneda();
		List<MonedaExtranjera> listaMonedas=conversorDeMoneda.getListaMonedasExtranjeras();
		String monedaLocal=conversorDeMoneda.getMonedaLocal();
		
		request.setAttribute("monedaLocal", monedaLocal);
		request.setAttribute("monedas", listaMonedas);
		
		return "forward:conversorDeMonedas.jsp";
	}

}

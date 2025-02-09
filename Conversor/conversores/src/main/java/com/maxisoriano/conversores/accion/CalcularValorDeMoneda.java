package com.maxisoriano.conversores.accion;

import java.io.IOException;

import com.maxisoriano.conversores.modelo.ConversorDeMoneda;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalcularValorDeMoneda implements Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		float montoAConvetir=Float.valueOf(request.getParameter("monto"));
		String nombreMoneda=request.getParameter("monedaNombre");
		
		ConversorDeMoneda conversorDeMoneda=new ConversorDeMoneda();
		float resultado=conversorDeMoneda.CalcularValor(montoAConvetir, nombreMoneda);
		
		request.setAttribute("resultado",resultado);
		request.setAttribute("monedaLocal",conversorDeMoneda.getMonedaLocal());
		request.setAttribute("monedaExtranjera", nombreMoneda);
		request.setAttribute("monto", montoAConvetir);
		
		return "forward:mostrarConversion.jsp";
	}

}

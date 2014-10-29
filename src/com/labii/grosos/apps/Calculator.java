package com.labii.grosos.apps;

public class Calculator {
	
	public static final String[] FUNCTIONS = {"Seleccione operación...","Sumar","Restar","Multiplicar","Dividir"};
	
	public String operar(String primerElemento, String segundoElemento, int operacion) throws Exception{
		String resultado = "";
		switch (operacion) {
		case 1:
			resultado += primerElemento + " + " + segundoElemento + " = "
							+ String.valueOf(sumar(primerElemento,segundoElemento));
			break;
		case 2:
			resultado += primerElemento + " - " + segundoElemento + " = "
							+ String.valueOf(restar(primerElemento,segundoElemento));
			break;
		case 3:
			resultado += primerElemento + " x " + segundoElemento + " = "
							+ String.valueOf(multiplicar(primerElemento,segundoElemento));
			break;
		case 4:
			resultado += primerElemento + " / " + segundoElemento + " = "
							+ String.valueOf(dividir(primerElemento,segundoElemento));
		}
		
		return resultado;
	}
	
	public float sumar(String primerElemento, String segundoElemento)throws Exception{
		float resultado = 0;
		
		try {
			resultado = Float.parseFloat(primerElemento);
			resultado += Float.parseFloat(segundoElemento);
		} catch (Exception e) {
			throw new Exception("Los campos ingresados solo deben contener números");
		}
		
		return resultado;
	}
	
	public float restar(String primerElemento, String segundoElemento)throws Exception{
		float resultado = 0;
		
		try {
			resultado = Float.parseFloat(primerElemento);
			resultado -= Float.parseFloat(segundoElemento);
		} catch (Exception e) {
			throw new Exception("Los campos ingresados solo deben contener números");
		}
		
		return resultado;
	}
	
	public float dividir(String primerElemento, String segundoElemento)throws Exception{
		float resultado = 0;
		
		try {
			resultado = Float.parseFloat(primerElemento);
			resultado /= Float.parseFloat(segundoElemento);
		} catch (Exception e) {
				throw new Exception("Los campos ingresados solo deben contener números");
		}
		
		return resultado;
	}
	
	public float multiplicar(String primerElemento, String segundoElemento)throws Exception{
		float resultado = 0;
		
		try {
			resultado = Float.parseFloat(primerElemento);
			resultado *= Float.parseFloat(segundoElemento);
		} catch (Exception e) {
			throw new Exception("Los campos ingresados solo deben contener números");
		}
		
		return resultado;
	}
	
	
}

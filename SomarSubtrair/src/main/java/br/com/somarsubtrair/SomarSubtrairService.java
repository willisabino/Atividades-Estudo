package br.com.somarsubtrair;

public class SomarSubtrairService {

	private String textN1;
	private String textN2;
	private String somar;
	private String subtrair;
	private String TextResultado;
	private float n1;
	private float n2;
	private float resultado;

	public String calculo(String soma, String subtrair, String valorN1, String valorN2) {

		this.setSomar(soma);
		this.setSubtrair(subtrair);
		this.setTextN1(valorN1);
		this.setTextN2(valorN2);

		this.setN1(Float.parseFloat(this.getTextN1()));
		this.setN2(Float.parseFloat(this.getTextN2()));

		if (this.getSomar() != null) {

			resultado = n1 + n2;

		} else if (this.getSubtrair() != null) {

			resultado = n1 - n2;

		}
		
		TextResultado = Float.toString(resultado);

		return TextResultado;
	}

	public String getTextN1() {
		return textN1;
	}

	public void setTextN1(String textN1) {
		this.textN1 = textN1;
	}

	public String getTextN2() {
		return textN2;
	}

	public void setTextN2(String textN2) {
		this.textN2 = textN2;
	}

	public String getSomar() {
		return somar;
	}

	public void setSomar(String somar) {
		this.somar = somar;
	}

	public String getSubtrair() {
		return subtrair;
	}

	public void setSubtrair(String subtrair) {
		this.subtrair = subtrair;
	}

	public String getTextResultado() {
		return TextResultado;
	}

	public void setTextResultado(String textResultado) {
		TextResultado = textResultado;
	}

	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
}

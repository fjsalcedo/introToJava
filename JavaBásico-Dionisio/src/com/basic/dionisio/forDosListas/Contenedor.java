package com.basic.dionisio.forDosListas;

public class Contenedor {
    private A campoA;
    private B campoB;
    
    public A getCampoA() {
	return campoA;
    }
    public void setCampoA(A campoA) {
	this.campoA = campoA;
    }
    public B getCampoB() {
	return campoB;
    }
    public void setCampoB(B campoB) {
	this.campoB = campoB;
    }
    public String toString() {
	return this.campoA.getValor() + "-" + this.campoB.getValor();
    }
    
    
}

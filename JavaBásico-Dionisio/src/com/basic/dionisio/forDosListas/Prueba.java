package com.basic.dionisio.forDosListas;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

    /**
     * @param args
     */
    public static void main(String[] args) {
	List<Contenedor> lista1 = new ArrayList<Contenedor>();
	List<Contenedor> lista2 = new ArrayList<Contenedor>();

	A a1 = new A();
	a1.setValor(1);
	A a2 = new A();
	a2.setValor(2);
	A a3 = new A();
	a3.setValor(3);
	B b1 = new B();
	b1.setValor(1);
	B b2 = new B();
	b2.setValor(2);
	B b3 = new B();
	b3.setValor(3);
	Contenedor c1 = new Contenedor();
	c1.setCampoA(a1);
	c1.setCampoB(b1);
	Contenedor c2 = new Contenedor();
	c2.setCampoA(a2);
	c2.setCampoB(b2);
	Contenedor c3 = new Contenedor();
	c3.setCampoA(a3);
	c3.setCampoB(b3);
	lista1.add(c1);
	lista1.add(c2);
	lista1.add(c3);
	
	A a4 = new A();
	a4.setValor(4);
	A a5 = new A();
	a5.setValor(5);
	A a6 = new A();
	a6.setValor(5);
	B b4 = new B();
	b4.setValor(4);
	B b5 = new B();
	b5.setValor(5);
	B b6 = new B();
	b6.setValor(6);
	Contenedor c4 = new Contenedor();
	c4.setCampoA(a4);
	c4.setCampoB(b4);
	Contenedor c5 = new Contenedor();
	c5.setCampoA(a5);
	c5.setCampoB(b5);
	Contenedor c6 = new Contenedor();
	c6.setCampoA(a6);
	c6.setCampoB(b6);
	lista2.add(c4);
	lista2.add(c5);
	lista2.add(c6);

	List<Contenedor> lista3 = new ArrayList<Contenedor>();
	for(int i=0;i<lista1.size();i++){
	    Contenedor cLista1 = lista1.get(i);
	    Contenedor cLista2 = lista2.get(i);
	    Contenedor cNuevo = new Contenedor();
	    cNuevo.setCampoA(cLista1.getCampoA());
	    cNuevo.setCampoB(cLista2.getCampoB());
	    lista3.add(cNuevo);
	}
	
	for(int i=0;i<lista3.size();i++){
	    Contenedor cLista = lista3.get(i);
	    System.out.println(cLista.toString());
	}
	
	
    }
}


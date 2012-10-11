package com.basic.dionisio.forDosListas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Bisiesto {

	public static void main(String[] args){
		GregorianCalendar anio = new GregorianCalendar(2016, 0, 1);
	    int dias;
	   anio.set(Calendar.MONTH, 1);
	    dias = anio.getActualMaximum();
	    
	    System.out.println(dias);
	}
}

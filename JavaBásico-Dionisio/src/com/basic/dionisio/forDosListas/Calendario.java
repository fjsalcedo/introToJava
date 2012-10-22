package com.basic.dionisio.forDosListas;

import java.util.Calendar;

public class Calendario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calendar anio = Calendar.getInstance();
		anio.set(Calendar.DAY_OF_MONTH, 1);
		anio.set(Calendar.MONTH, 0);
		anio.set(Calendar.YEAR, 2012);
		
		System.out.println(anio.getTime());
		
		while(!(anio.get(Calendar.DAY_OF_MONTH) == 31 && anio.get(Calendar.MONTH) == 11)){
			anio.add(Calendar.DAY_OF_MONTH, 1);
			
			System.out.println(anio.getTime());
	}

	}
	}

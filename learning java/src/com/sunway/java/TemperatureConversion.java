package com.sunway.java;

public class TemperatureConversion {

	public void CelciustoFahrenheit(double c) { //double is used because it allows decimal no
		double f = (c*9/5)+32;
	System.out.println(c + "celcius is equal to" + f + "F" );
}
	public void FahrenheittoCelcius(double f) {
		double c = (f-32)*5/9;
		System.out.println(f + "Farenheit is equal to" + c + "C");
	}
	
	public float fahrenheittocelcius(float f) {
		float c = (f-32)*5/9;
	return c;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TemperatureConversion tc = new TemperatureConversion();
		tc.CelciustoFahrenheit(37.6);
		tc.FahrenheittoCelcius(101);
		tc.fahrenheittocelcius(101);
		System.out.println(tc.fahrenheittocelcius(101));
	}

}

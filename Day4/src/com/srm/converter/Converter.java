package com.srm.converter;

import java.util.Scanner;

import com.srm.currencyconverter.*;
import com.srm.distanceconverter.*;
import com.srm.timeconverter.*;

public class Converter {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Currency c=new Currency();
		Distance d=new Distance();
		Time t=new Time();
	
		int n;
		System.out.println("******************************************************************");
		System.out.println("CURRENCY CONVERTER");
		System.out.println("******************************************************************");
		c.dollarToRupee();
	    c.rupeeToDollar();
		c.euroToRupee();
		c.rupeeToEuro();
		c.yenToRupee();
		c.rupeeToYen();
		d.mTokm();
		d.kmTom();
		d.milesTokm();
		d.kmTomiles();
		t.hourstominutes();
		t.hourstoseconds();
		t.secondstohours();
		t.minutestohours();
	}
}

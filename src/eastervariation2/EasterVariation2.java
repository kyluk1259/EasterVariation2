/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eastervariation2;

import javax.swing.*;
/**
 *
 * @author Kyle's PC
 */
public class EasterVariation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 	//a - m - the quotients and remainders needed
     	int a, b, c, d, e, f, g, h, i, j, k, m, n, p, q;
    	int month;  //Easter month
     	int day;    //Easter day
     	int year;   //Easter's year
	String monthStr;

    	//Ask user for year
     	String yearStr = JOptionPane.showInputDialog("Easter "
		+"Date Calculator\nPlease enter a year");

     	//Convert the year from a String to an int
     	year = Integer.parseInt(yearStr);

	//Calculations
	a = year / 100;
	b = year % 100;
	c = (3 * (a + 25)) / 4;
	d = (3 * (a + 25)) % 4;
        q = (8 * (a+11)) / 25;
	e = b % 4;
	f = ((5 * a) + b) % 19;
	g = ((19*f)+ c - q) / 30;
	h = (f + (11*g)) / 319;
	i = c / 4;
	k = (60 * (5 - d) + b) % 4;
	j = (60 * (5 - d) + b) / 4;
	m = (a + 11*h + 22*j)/451;
        n = ((2 * j) - k - g + h);
	month = (g - h +n + 114)/31;
	p = (g - h +n + 114)%31;
	day = (p + 1) / 1;

    	//determine the month in String format
    	if(month == 3){
            monthStr = "March";
     	} else {
            monthStr = "April";
     	}

    	//Display the results
     	JOptionPane.showMessageDialog(null, "Easter will fall"
		+" on Sunday, "+monthStr+" "+day+", "+year);
    }
}

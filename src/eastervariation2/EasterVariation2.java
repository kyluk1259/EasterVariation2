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
     	int a, b, c, d, e, f, g, h, i, j, k, m, p;
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
	a = year % 19;
	b = year / 100;
	c = year % 100;
	d = b / 4;
	e = b % 4;
	f = (8 + b) / 25;
	g = (b - f + 1)/3;
	h = (19 * a + b - d - g + 15) % 30;
	i = c / 4;
	k = c % 4;
	j = (32 + 2*e + 2*i - h - k)%7;
	m = (a + 11*h + 22*j)/451;
	month = (h + j -7*m + 114)/31;
	p = (h + j - 7*m + 114)%31;
	day = p + 1;

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

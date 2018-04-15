package com.main;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

public class Back {
	public String solver(String eq) {
		String equation = eq;
		String equation2 = "";
		for (int i = 0; i < equation.length(); i++) {
			if(equation.charAt(i) != ' ')
				equation2 += equation.charAt(i);
		}
		//equation2 += "=x";
		//System.out.println("Equation : " + equation2);
		//Argument x = new Argument("x");
		Expression solver = new Expression(equation2);
		double result1 = solver.calculate();
		//System.out.println("result 1: " + result1);		
		return String.valueOf(result1);
	}

}

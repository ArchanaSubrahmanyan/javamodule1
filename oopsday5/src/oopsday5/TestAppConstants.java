package oopsday5;

import another.AppConstants; //package is imported.be specific of what to import
import java.lang.Math; //unused imports are bad code

public class TestAppConstants {

	public static void main(String[] args) {
		double salary=40000;
		double tax=salary*AppConstants.tax_rate;
		double sur_charge= salary * AppConstants.sur_charge;
		System.out.println(tax);
		System.out.println(sur_charge);
		

	}

}

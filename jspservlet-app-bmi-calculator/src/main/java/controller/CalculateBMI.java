package controller;

public class CalculateBMI {

	//Enter the code here....mvn 
	public static double calculate(double heightInMeter, double weight) {
		double bmindex = weight / (heightInMeter * heightInMeter);
        	return bmindex;
	}

	public static String description(double roundedBMI) {
		
		String des = null;
		if (roundedBMI < 18.5) {
            		des = "Under Weight";
        	} else if (roundedBMI >= 18.5 && roundedBMI < 24.9) {
            		des = "Normal";
        	} else if (roundedBMI >= 25 && roundedBMI < 29.9) {
            		des =  "Over Weight";
        	} else if (roundedBMI >= 30 && roundedBMI < 34.9) {
            		des =  "Obese";
        	} else {
            		des = "Extremely Obese";
        	}
		return des;
	}
}

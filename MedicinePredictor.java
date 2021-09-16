package com.xworkz.method;

public class MedicinePredictor {
	
	public static int diseasePredictor(int symptoms ,int diseases ) {
		
		int accuracyOfDisease =symptoms*diseases;
		return accuracyOfDisease;
		
	}

	public static void main(String[] args) {
		
	int	symptoms=5;
	int diseases=10;
	int medicinerequired;
	medicinerequired=MedicinePredictor.diseasePredictor(symptoms, diseases);
	
	System.out.println(medicinerequired+"%");

	}

}

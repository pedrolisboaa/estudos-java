package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somatoriaNotas() {
		return nota1 + nota2 + nota3;
	}
	
	public String toString() {
		if(somatoriaNotas() >= 60) {
			return "FINAL GRADE = "+ String.format("%.2f%n", somatoriaNotas())+ "PASS.";
		}else {
			return "FINAL GRADE = "+ String.format("%.2f%n", somatoriaNotas())+ "FAILED. %n MISSING%n" + String.format("%.2f POINTS.",60.0 - somatoriaNotas());
		}
	}

}

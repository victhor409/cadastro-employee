package entites;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	
	public double NetSalary(double grossSalary) {
		return this.grossSalary - tax;
	}
	
	public String toString() {
		return "Emplyee:"
		+ name
		+ ", $"
		+ String.format( "%.2f",NetSalary(grossSalary));
	}
	//metodo para calcular o aumento
	public double increaseSalary(double percentage) {
		return  percentage = NetSalary(grossSalary)+grossSalary*0.10;
	  }
	}
	
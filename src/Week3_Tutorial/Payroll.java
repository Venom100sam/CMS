package Week3_Tutorial;

public class Payroll {
	
	    private String name;
	    private int idNumber;
	    private double payRate;
	    private double hoursWorked;

	    public Payroll(String name, int idNumber) {
	        this.name = name;
	        this.idNumber = idNumber;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getIdNumber() {
	        return idNumber;
	    }

	    public void setIdNumber(int idNumber) {
	        this.idNumber = idNumber;
	    }

	    public double getPayRate() {
	        return payRate;
	    }

	    public void setPayRate(double payRate) {
	        this.payRate = payRate;
	    }

	    public double getHoursWorked() {
	        return hoursWorked;
	    }

	    public void setHoursWorked(double hoursWorked) {
	        this.hoursWorked = hoursWorked;
	    }

	    public double getGrossPay() {
	        return payRate * hoursWorked;
	    }


public static void main(String[] args ) {
	Payroll d = new Payroll("Sameer", 123 );
	System.out.println(	d.getName());
	System.out.println(	d.getIdNumber());
	System.out.println(	d.getPayRate());
	System.out.println(	d.getHoursWorked());
	System.out.println(	d.getGrossPay());
	}
}

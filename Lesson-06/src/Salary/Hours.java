package Salary;

public class Hours extends Worker implements Salary {
	
	private double rateofHour;
	private int hour;
	
	public Hours(String name, double rateofHour, int hour) {
		super(name);
		this.rateofHour = rateofHour;
		this.hour = hour;
		
		
		
	}
	public double getRateofHour() {
		return rateofHour;
	}
	public void setRateofHour(double rateofHour) {
		this.rateofHour = rateofHour;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	@Override
	public void salary() {
		double salary = this.hour * this.rateofHour;
		System.out.println("" + super.getName() + " відпрацьовав " + hour + " годин, зарплата становить " + salary + " грн.");
	
	}
	
}
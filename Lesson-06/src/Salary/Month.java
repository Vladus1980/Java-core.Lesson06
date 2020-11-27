package Salary;

public class Month extends Worker implements Salary{

		private double rateofMonth;

		public Month(String name, double rateofMonth) {
			super(name);
			this.rateofMonth = rateofMonth;
		}

		public double getRateofMonth() {
			return rateofMonth;
		}

		public void setRateofMonth(double rateofMonth) {
			this.rateofMonth = rateofMonth;
		}

		@Override
		public void salary() {
			double salary = this.rateofMonth;
			System.out.println("Заробітна плата працівника " + super.getName() + " становить " + salary + "грн");
		}
		
	

	}


	



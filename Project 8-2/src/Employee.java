
public class Employee extends Person {

	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
		}
		private String ssn;
		
		public Employee(String firstName, String lastName, String ssn) {
			super(firstName, lastName);
			this.ssn = ssn;
		}

		public String getSsn() {
			return ssn;
		}

		public void setSsn(String ssn) {
			this.ssn = ssn;
		}

		@Override
		public String toString() {
			return super.toString() + "\n" + "SSN: " + ssn;
		}
		
	}

public class Customer extends Person {

	private String number;
	
	public Customer(String firstName, String lastName, String number) {
		super(firstName, lastName);
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return super.toString() + "\n" + "Customer number: " + number;
	}
	
	
}
	
	
package HarpreetAPIAutomation.FirstAPIAutomation;

public class BasicInformation 
{
	private String name;
	private int age;
	private AddressInformation address;
	
	public AddressInformation getAddress() {
		return address;
	}
	public void setAddress(AddressInformation address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

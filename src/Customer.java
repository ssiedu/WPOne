
public class Customer {
	private int code;
	private String name;
	private String address;
	
	
	
	
	@Override
	public String toString() {
		return "Customer [code=" + code + ", name=" + name + ", address=" + address + "]";
	}
	public Customer() {
		super();
	}
	public Customer(int code) {
		super();
		this.code = code;
	}
	public Customer(int code, String name, String address) {
		this.code = code;
		this.name = name;
		this.address = address;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

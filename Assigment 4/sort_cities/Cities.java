package sort_cities;

public class Cities implements Comparable <Cities> {

	private String name;
	private int zipCode;
	
	
	public Cities() {
		
	}
	
	public Cities (String name , int zipCode ) {
		
		this.name = name ;
		this.zipCode = zipCode;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	

	@Override
	public String toString() {
		return "Cities [name=" + name + ", zipCode=" + zipCode + "]" ;
	}

	@Override
	public int compareTo(Cities newCity) {
		// TODO Auto-generated method stub
		return this.zipCode - newCity.zipCode ;
	}
	
	

	
}

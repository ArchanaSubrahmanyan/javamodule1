package srp;

public class UstEmployeeProfile {

	private long empId;
	private int age;
	private String name;
	
	public UstEmployeeProfile() {
		// TODO Auto-generated constructor stub
	}

	public UstEmployeeProfile(long empId, int age, String name) {
		super();
		this.empId = empId;
		this.age = age;
		this.name = name;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void updateBasicDetails() {
		
	}
}

package ro.management.pojo;

public class Department {
	
	private int departmentId;
	private String departmentName;
	private String departmentDescription;

	public Department(int departmentId, String departmentName, String departmentDescription) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentDescription = departmentDescription;
	}

	public Department() {
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}
}

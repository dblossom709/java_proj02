package Ex;

public class Employee {
	public String name;
	public String grade;
	protected String skillset;

	public Employee() {}
	public Employee(String name) {
		this.name = name;
	}
}

class Engineer extends Employee {

	Employee e = new Engineer();
	
	
	private String skillset;
	public String getSkillSet() {
		return skillset;
	}

	public void setSkillSet(String skillset) {
		this.skillset = skillset;
	}
}

package infinite.ServletJdbcRealTime;

public class Employ {

	private int empno;
	private String name;
	private Gender gender;
	private String dept;
	private String desig;
	private int basic;
	
	
	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getDesig() {
		return desig;
	}


	public void setDesig(String desig) {
		this.desig = desig;
	}


	public int getBasic() {
		return basic;
	}


	public void setBasic(int basic) {
		this.basic = basic;
	}


	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", desig="
				+ desig + ", basic=" + basic + "]";
	}


	public Employ() {
		// TODO Auto-generated constructor stub
	}


	public Employ(int empno, String name, Gender gender, String dept, String desig, int basic) {
		this.empno = empno;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}
	
	
}

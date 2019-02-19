package kr.or.bit;
/*
 * 사원은 사번, 이름, 직종(job)을 가지고 있다 => 원칙(캡슐화)=>read,write 지원
 * 사원 생성시 default 로 사번9999, 
 */

public class Employee {
	private int empno;
	private String ename;
	private String job;
	
	public Employee() { //default constructor
	  	empno = 9999;
	  	ename = "아무개";
	  	job = "인턴";
	}
	
	public Employee(int no, String name , String jobdata) { //overloading constructor
		empno = no;
		ename = name;
		job = jobdata;
	}
	
	//public int getEmpno() { //read : getter
	//	return empno;
	//}
	public void setEmpno(int empno) { //write : setter
		this.empno = empno;
	}
	
	public String getEname() {
		return ename +" 님";  //강제...(간접)
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	//public String getJob() {
	//	return job;
	//}
	public void setJob(String job) {
		this.job = job;
	}
	
	//일반함수
	public void employeeInfoPrint(){
		System.out.printf("사번:[%d],이름:[%s],직종:[%s]\n", empno,ename,job);
	}
	
}

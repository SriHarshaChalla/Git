package com.git.sample;

class Harsha{
	private int empID;
	private String eName;
	
	public Harsha(int empID, String eName) {
		super();
		this.empID = empID;
		this.eName = eName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "Harsha [empID=" + empID + ", eName=" + eName + "]";
	}
	
	
}
public class GitCode {
	
	public static void main(String args[]) {
		Harsha h = new Harsha(1,"harsha");
		System.out.println(h);
	} 
}

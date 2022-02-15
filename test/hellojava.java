package test;

public class hellojava {
	int studentid;
	String name;
	int grade;
	String address;
	public void showstudentinfo() {
		System.out.println(name + grade);
	}

	public static void main(String[] args) {
		hellojava a = new hellojava();
		a.name = "woojin";
		a.grade = 10;
		a.showstudentinfo();
		
	}

}

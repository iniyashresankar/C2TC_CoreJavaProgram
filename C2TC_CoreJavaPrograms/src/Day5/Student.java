package Day5;

public class Student extends Person{
	
	private int uid;
	private String sname;
	private String courseName;
	
	public Student(int uid, String sname, String courseName) {
		super();
		this.uid = uid;
		this.sname = sname;
		this.courseName = courseName;
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Student [uid=" + uid + ", sname=" + sname + ", courseName=" + courseName + "]";
	}
	
	
	
	

}

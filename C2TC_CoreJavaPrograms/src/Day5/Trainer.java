package Day5;

public class Trainer extends Person{
	
	private String session;
	private String design;
	private String batchNO;
	
	
	public Trainer(String session, String design, String batchNO) {
		super();
		this.session = session;
		this.design = design;
		this.batchNO = batchNO;
	}
	
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public String getBatchNO() {
		return batchNO;
	}
	public void setBatchNO(String batchNO) {
		this.batchNO = batchNO;
	}
	

}

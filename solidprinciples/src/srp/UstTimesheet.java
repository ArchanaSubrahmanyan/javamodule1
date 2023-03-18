package srp;

public class UstTimesheet {

	private int workedHours;
	private int totalHours;
	
	public UstTimesheet() {
		// TODO Auto-generated constructor stub
	}

	public UstTimesheet(int workedHours, int totalHours) {
		super();
		this.workedHours = workedHours;
		this.totalHours = totalHours;
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

	public int getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}
	public void updateHours() {
		
	}
}

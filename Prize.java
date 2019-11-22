package prizes;

import java.util.List;

public class Prize {

	private String year; // "2018",
	private List<Laureates> laureates;
	private String category;// "physics",
	//private String overallMotivation; // "“for groundbreaking inventions in the field of laser physics”",
	
	
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	/*
	 * public String getOverallMotivation() { return overallMotivation; } public
	 * void setOverallMotivation(String overallMotivation) { this.overallMotivation
	 * = overallMotivation; }
	 */
	public List<Laureates> getLaureates() {
		return laureates;
	}
	public void setLaureates(List<Laureates> laureates) {
		this.laureates = laureates;
	}
	
	
}

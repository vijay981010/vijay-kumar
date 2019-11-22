package prizes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Winners {
	
	//1. Search a Nobel prize winner by name 
	public JSONObject winnerByName(String name) {
		List<JSONObject> prizes = null;
		try {
			Object obj = new JSONParser().parse(new FileReader("C:\\Users\\vineethraj\\prize.json"));
			HashMap<String, List<JSONObject>> prizeMap = (HashMap<String, List<JSONObject>>) obj;
			 prizes = prizeMap.get("prizes");
			// System.out.println(prizes);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONObject jsnObject = null;
		for (int i = 0; i < prizes.size(); i++) {
			JSONObject jObj = prizes.get(i);
			String year = (String) jObj.get("year");
			String category = (String) jObj.get("category");
			List<JSONObject> laureatesList = (List<JSONObject>) jObj.get("laureates");
			for (int j = 0; i < laureatesList.size(); i++) {
				JSONObject obj = laureatesList.get(i);
				String firstname = (String) obj.get("firstname");
				System.out.println(firstname);
				if(firstname.equalsIgnoreCase(name)) {
					jsnObject = obj;
					return jsnObject;
				}
			}
		}
		return null;
	 }

	//2. Find out Nobel prize winner in a year input by him
	
	public Laureates winnerByYear(String year) {
		 
		 return null;
	 }
	
	//3. Search Prize winner based on the year and category (Peace/Chemistry/Physics etc...)
	
	public Laureates winnerByYearAndCategory(String year, String category) {
		 
		 return null;
	 }
	
	//4. Show a list of all Winners in Alphabetical order (With year and category against the name)
	
	public Laureates showWinnersByAsecOrder() {
		 
		 return null;
	 }

	
	
	public static void main(String[] args) {
		
		try {
			Winners winners = new Winners();
			JSONObject laureate = winners.winnerByName("Arthur");
			System.out.println(laureate.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}

package readjson;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class TestJson {

	public static void main(String[] args) {
		
		JSONObject employeeDetails = new JSONObject();
		employeeDetails.put("firstname","Archana");
		employeeDetails.put("lastname","Subrahmanyan");
		employeeDetails.put("website","javaport.in");
		
        JSONObject employeeObject = new JSONObject(); 
        employeeObject.put("employee", employeeDetails);
		
		JSONObject employeeDetails2= new JSONObject();
		employeeDetails2.put("firstname", "Harry");
		employeeDetails2.put("lastname", "kane");
		employeeDetails2.put("website", "example.com");
		
		 JSONObject employeeObject2 = new JSONObject(); 
	     employeeObject2.put("employee", employeeDetails2);
	         
	     //Add employees to list
	     JSONArray employeeList = new JSONArray();
	     employeeList.add(employeeObject);
	     employeeList.add(employeeObject2);
	     
	     //try with resources;
	     try (FileWriter file = new FileWriter("employees.json"))
	     {
	    	 file.write(employeeList.toJSONString());
	    	 file.flush();
	     } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

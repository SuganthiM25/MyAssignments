package homeassignments.Polymorphism;

public class APIClient {
	
	public void sendRequest(String endPoint) 
	{
		
		System.out.println(endPoint);
	}
	public void sendRequest(String endPoint,String requestBody,boolean requestStatus) 
	{
		
		if(requestStatus=true) {
			System.out.println("API request called successfully");
		}
	}
	
	public static void main(String[] args) {
		APIClient cli = new APIClient();
		cli.sendRequest("Endpoint reached");
		cli.sendRequest("Endpoint Reached", "Api called", true);
		
	}
}

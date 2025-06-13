package week3.day2;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("API EndPoint is " + endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requeststatus) {
		System.out.print("The Endpoint is " + endpoint + "," + " and Body is " + requestBody + "," + " and Staus is "
				+ requeststatus);

	}

	public static void main(String[] args) {
		APIClient apiRequest = new APIClient();
		apiRequest.sendRequest("https://reqres.in/api/");
		apiRequest.sendRequest("https://sample.in/api/", "api/sadham", true);

	}

}

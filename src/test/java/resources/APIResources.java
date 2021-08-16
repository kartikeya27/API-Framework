package resources;

//enum is special class in java which has collection of constants and methods
public enum APIResources {
	getServiceAPI("/service/json");
	private String resource;

	APIResources(String resource) {
		this.resource = resource;
	}
	
	public String getResource() {
		return resource;
	}
}

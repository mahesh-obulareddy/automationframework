package ttt.bootcamp.drivermanager;

public enum BrowserTypes {
	CHROME("chrome"),FIREFOX("firefox");
	
	private String value;

	private BrowserTypes(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}

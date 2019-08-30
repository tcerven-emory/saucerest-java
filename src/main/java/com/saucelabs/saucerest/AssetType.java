/**
 * 
 */
package com.saucelabs.saucerest;

/**
 * @author tcerven
 *
 */
public enum AssetType {
	
	AUTOMATOR ("automator","log"),
	NETWORK ("network","har"),
	SELENIUM ("selenium-server","log"),
	LOG ("log","json"),
	VIDEO ("video","mp4"),
	CONSOLE ("console","json");
	
	private final String name;
	private final String extension;
	
	AssetType(String name, String extension) {
		this.extension = extension;
		this.name = name;
	}
	
	public String getName() { return this.name; }
	public String getExtension() { return this.extension; }
}


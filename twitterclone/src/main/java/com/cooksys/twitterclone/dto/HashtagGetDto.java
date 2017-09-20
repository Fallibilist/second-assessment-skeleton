/**
 * 
 */
package com.cooksys.twitterclone.dto;

import java.sql.Timestamp;

/**
 * @author Greg Hill
 *
 */
public class HashtagGetDto {

	private String label;
	private Timestamp firstUsed;
	private Timestamp lastUsed;
	
	/**
	 * Default Constructor
	 */
	public HashtagGetDto() { }
	
	/**
	 * @param label
	 * @param firstUsed
	 * @param lastUsed
	 */
	public HashtagGetDto(String label, Timestamp firstUsed, Timestamp lastUsed) {
		this();
		this.label = label;
		this.firstUsed = firstUsed;
		this.lastUsed = lastUsed;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the firstUsed
	 */
	public Timestamp getFirstUsed() {
		return firstUsed;
	}

	/**
	 * @param firstUsed the firstUsed to set
	 */
	public void setFirstUsed(Timestamp firstUsed) {
		this.firstUsed = firstUsed;
	}

	/**
	 * @return the lastUsed
	 */
	public Timestamp getLastUsed() {
		return lastUsed;
	}

	/**
	 * @param lastUsed the lastUsed to set
	 */
	public void setLastUsed(Timestamp lastUsed) {
		this.lastUsed = lastUsed;
	}
	
}
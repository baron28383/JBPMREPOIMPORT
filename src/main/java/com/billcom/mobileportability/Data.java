package com.billcom.mobileportability;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Data implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Action")
	private java.lang.String action;

	public Data() {
	}

	public java.lang.String getAction() {
		return this.action;
	}

	public void setAction(java.lang.String action) {
		this.action = action;
	}
	
	@Override
	public java.lang.String toString() {
		return "Action ["+ this.action + "]";
	}
	public Data(java.lang.String action) {
		this.action = action;
	}

}
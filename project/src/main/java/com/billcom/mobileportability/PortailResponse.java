package com.billcom.mobileportability;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class PortailResponse implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Code")
	private java.lang.String code;

	@org.kie.api.definition.type.Label("Message")
	private java.lang.String message;

	public PortailResponse() {
	}

	public java.lang.String getCode() {
		return this.code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.lang.String getMessage() {
		return this.message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}
	public java.lang.String toString() {
		return "PortailResponse [ code=" + this.code
				+ ", message=" + this.message + "]";
	}

	public PortailResponse(java.lang.String code, java.lang.String message) {
		this.code = code;
		this.message = message;
	}

}
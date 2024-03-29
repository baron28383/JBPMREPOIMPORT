package com.billcom.mobileportability;

import com.billcom.mobileportability.Data;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
@javax.persistence.Entity
@javax.persistence.Table(name = "UpdatePortabilityStatus")
public class UpdatePortabilityStatus extends Data
		implements
			java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("IDCRM")
	private java.lang.String idCrm;

	@org.kie.api.definition.type.Label("portaRef")
	private java.lang.String portaRef;

	@org.kie.api.definition.type.Label("statusCode")
	private java.lang.String statusCode;

	@org.kie.api.definition.type.Label("statusReason")
	private java.lang.String statusReason;

	@org.kie.api.definition.type.Label("PortageDate")
	private java.lang.String portageDate;

	public UpdatePortabilityStatus() {
	}

	public java.lang.String getIdCrm() {
		return idCrm;
	}
	public void setIdCrm(java.lang.String idCrm) {
		this.idCrm = idCrm;
	}
	public java.lang.String getPortaRef() {
		return portaRef;
	}
	public void setPortaRef(java.lang.String portaRef) {
		this.portaRef = portaRef;
	}
	public java.lang.String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(java.lang.String statusCode) {
		this.statusCode = statusCode;
	}
	public java.lang.String getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(java.lang.String statusReason) {
		this.statusReason = statusReason;
	}
	public java.lang.String getPortageDate() {
		return portageDate;
	}
	public void setPortageDate(java.lang.String portageDate) {
		this.portageDate = portageDate;
	}

	public java.lang.String toString() {
		return "[idCrm=" + this.idCrm + ", portaRef="
				+ this.portaRef + ", statusCode=" + this.statusCode
				+ ", statusReason=" + this.statusReason + ", portageDate="
				+ this.portageDate +super.toString() + "]";
	}



	public UpdatePortabilityStatus(java.lang.String idCrm,
			java.lang.String portaRef, java.lang.String statusCode,
			java.lang.String statusReason, java.lang.String portageDate) {
		this.idCrm = idCrm;
		this.portaRef = portaRef;
		this.statusCode = statusCode;
		this.statusReason = statusReason;
		this.portageDate = portageDate;
	}

}
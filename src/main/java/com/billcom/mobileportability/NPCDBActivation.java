package com.billcom.mobileportability;

import com.billcom.mobileportability.Data;

/**
 * This class was automatically generated by the data modeler tool
 */

@javax.persistence.Entity
public class NPCDBActivation extends Data implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("MessageCode")
	private java.lang.String messageCode;

	@org.kie.api.definition.type.Label("NPRequestId")
	private java.lang.String nPRequestId;

	@org.kie.api.definition.type.Label("RecipientId")
	private java.lang.String recipientId;

	@org.kie.api.definition.type.Label("NewRoute")
	private java.lang.String newRoute;

	@org.kie.api.definition.type.Label("NPDueDate")
	private String nPDueDate;

	@org.kie.api.definition.type.Label("NrList")
	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private java.util.List<com.billcom.mobileportability.Nr> nrList;

	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("NpList")
	private java.util.List<com.billcom.mobileportability.Np> npList;

	@org.kie.api.definition.type.Label("ProcessType")
	private java.lang.String processType;

	@org.kie.api.definition.type.Label("NPId")
	private java.lang.String npId;

	public NPCDBActivation() {
	}

	public java.lang.String getMessageCode() {
		return this.messageCode;
	}

	public void setMessageCode(java.lang.String messageCode) {
		this.messageCode = messageCode;
	}

	public java.lang.String getnPRequestId() {
		return this.nPRequestId;
	}

	public void setnPRequestId(java.lang.String nPRequestId) {
		this.nPRequestId = nPRequestId;
	}

	public java.lang.String getRecipientId() {
		return this.recipientId;
	}

	public void setRecipientId(java.lang.String recipientId) {
		this.recipientId = recipientId;
	}

	public java.lang.String getNewRoute() {
		return this.newRoute;
	}

	public void setNewRoute(java.lang.String newRoute) {
		this.newRoute = newRoute;
	}

	public java.util.List<com.billcom.mobileportability.Nr> getNrList() {
		return this.nrList;
	}

	public void setNrList(
			java.util.List<com.billcom.mobileportability.Nr> nrList) {
		this.nrList = nrList;
	}

	public java.util.List<com.billcom.mobileportability.Np> getNpList() {
		return this.npList;
	}

	public void setNpList(
			java.util.List<com.billcom.mobileportability.Np> npList) {
		this.npList = npList;
	}

	@Override
	public java.lang.String toString() {
		return "NPCDBActivation [messageCode=" + this.messageCode + ", nPRequestId=" + this.nPRequestId + ", recipientId=" + this.recipientId
				+ ", newRoute=" + this.newRoute + ", nPDueDate=" + this.nPDueDate + ", nrList=" + this.nrList + ", npList=" + this.npList
				+ ", processType=" + this.processType + ", npId=" + this.npId + ", toString()=" + super.toString() + "]";
	}
	public java.lang.String getProcessType() {
		return this.processType;
	}

	public void setProcessType(java.lang.String processType) {
		this.processType = processType;
	}

	public java.lang.String getNpId() {
		return this.npId;
	}

	public void setNpId(java.lang.String npId) {
		this.npId = npId;
	}

	public java.lang.String getnPDueDate() {
		return this.nPDueDate;
	}

	public void setnPDueDate(java.lang.String nPDueDate) {
		this.nPDueDate = nPDueDate;
	}

	public NPCDBActivation(java.lang.String messageCode, java.lang.String nPRequestId,
			java.lang.String recipientId, java.lang.String newRoute,
			java.lang.String nPDueDate,
			java.util.List<com.billcom.mobileportability.Nr> nrList,
			java.util.List<com.billcom.mobileportability.Np> npList,
			java.lang.String processType, java.lang.String npId) {
		this.messageCode = messageCode;
		this.nPRequestId = nPRequestId;
		this.recipientId = recipientId;
		this.newRoute = newRoute;
		this.nPDueDate = nPDueDate;
		this.nrList = nrList;
		this.npList = npList;
		this.processType = processType;
		this.npId = npId;
	}

}
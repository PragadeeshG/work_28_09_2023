package com.test1;

public class ReleaseControls {
	private Integer releaseIndicator;
	private String deploymentMode;
	private String adoEnabled;
	private String adoAttestations;
	private String adoMigratedOn;
	private Integer reposMigrated;
	private Boolean testControlsMet;
	private Boolean testEvidencesAttached;
	private Integer testCoverage;
	private String testManagerContact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ReleaseControls() {

	}

	public ReleaseControls(Integer releaseIndicator, String deploymentMode, String adoEnabled, String adoAttestations,
			String adoMigratedOn, Integer reposMigrated, Boolean testControlsMet, Boolean testEvidencesAttached,
			Integer testCoverage, String testManagerContact, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.releaseIndicator = releaseIndicator;
		this.deploymentMode = deploymentMode;
		this.adoEnabled = adoEnabled;
		this.adoAttestations = adoAttestations;
		this.adoMigratedOn = adoMigratedOn;
		this.reposMigrated = reposMigrated;
		this.testControlsMet = testControlsMet;
		this.testEvidencesAttached = testEvidencesAttached;
		this.testCoverage = testCoverage;
		this.testManagerContact = testManagerContact;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getReleaseIndicator() {
		return releaseIndicator;
	}

	public void setReleaseIndicator(Integer releaseIndicator) {
		this.releaseIndicator = releaseIndicator;
	}

	public String getDeploymentMode() {
		return deploymentMode;
	}

	public void setDeploymentMode(String deploymentMode) {
		this.deploymentMode = deploymentMode;
	}

	public String getAdoEnabled() {
		return adoEnabled;
	}

	public void setAdoEnabled(String adoEnabled) {
		this.adoEnabled = adoEnabled;
	}

	public String getAdoAttestations() {
		return adoAttestations;
	}

	public void setAdoAttestations(String adoAttestations) {
		this.adoAttestations = adoAttestations;
	}

	public String getAdoMigratedOn() {
		return adoMigratedOn;
	}

	public void setAdoMigratedOn(String adoMigratedOn) {
		this.adoMigratedOn = adoMigratedOn;
	}

	public Integer getReposMigrated() {
		return reposMigrated;
	}

	public void setReposMigrated(Integer reposMigrated) {
		this.reposMigrated = reposMigrated;
	}

	public Boolean getTestControlsMet() {
		return testControlsMet;
	}

	public void setTestControlsMet(Boolean testControlsMet) {
		this.testControlsMet = testControlsMet;
	}

	public Boolean getTestEvidencesAttached() {
		return testEvidencesAttached;
	}

	public void setTestEvidencesAttached(Boolean testEvidencesAttached) {
		this.testEvidencesAttached = testEvidencesAttached;
	}

	public Integer getTestCoverage() {
		return testCoverage;
	}

	public void setTestCoverage(Integer testCoverage) {
		this.testCoverage = testCoverage;
	}

	public String getTestManagerContact() {
		return testManagerContact;
	}

	public void setTestManagerContact(String testManagerContact) {
		this.testManagerContact = testManagerContact;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}

package com.test1;

public class ReleaseControlsDates {
	private Integer releaseIndicator;
	private String storyCreationDate;
	private Integer noOfStories;
	private String sitStartDate;
	private String sitCompletionDate;
	private String uatStartDate;
	private String uatCompletionDate;
	private String staggingStartDate;
	private String stagingCompletionDate;
	private String releaseDate;
	private String uvtDate;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ReleaseControlsDates() {

	}

	public ReleaseControlsDates(Integer releaseIndicator, String storyCreationDate, Integer noOfStories,
			String sitStartDate, String sitCompletionDate, String uatStartDate, String uatCompletionDate,
			String staggingStartDate, String stagingCompletionDate, String releaseDate, String uvtDate,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.releaseIndicator = releaseIndicator;
		this.storyCreationDate = storyCreationDate;
		this.noOfStories = noOfStories;
		this.sitStartDate = sitStartDate;
		this.sitCompletionDate = sitCompletionDate;
		this.uatStartDate = uatStartDate;
		this.uatCompletionDate = uatCompletionDate;
		this.staggingStartDate = staggingStartDate;
		this.stagingCompletionDate = stagingCompletionDate;
		this.releaseDate = releaseDate;
		this.uvtDate = uvtDate;
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

	public String getStoryCreationDate() {
		return storyCreationDate;
	}

	public void setStoryCreationDate(String storyCreationDate) {
		this.storyCreationDate = storyCreationDate;
	}

	public Integer getNoOfStories() {
		return noOfStories;
	}

	public void setNoOfStories(Integer noOfStories) {
		this.noOfStories = noOfStories;
	}

	public String getSitStartDate() {
		return sitStartDate;
	}

	public void setSitStartDate(String sitStartDate) {
		this.sitStartDate = sitStartDate;
	}

	public String getSitCompletionDate() {
		return sitCompletionDate;
	}

	public void setSitCompletionDate(String sitCompletionDate) {
		this.sitCompletionDate = sitCompletionDate;
	}

	public String getUatStartDate() {
		return uatStartDate;
	}

	public void setUatStartDate(String uatStartDate) {
		this.uatStartDate = uatStartDate;
	}

	public String getUatCompletionDate() {
		return uatCompletionDate;
	}

	public void setUatCompletionDate(String uatCompletionDate) {
		this.uatCompletionDate = uatCompletionDate;
	}

	public String getStaggingStartDate() {
		return staggingStartDate;
	}

	public void setStaggingStartDate(String staggingStartDate) {
		this.staggingStartDate = staggingStartDate;
	}

	public String getStagingCompletionDate() {
		return stagingCompletionDate;
	}

	public void setStagingCompletionDate(String stagingCompletionDate) {
		this.stagingCompletionDate = stagingCompletionDate;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getUvtDate() {
		return uvtDate;
	}

	public void setUvtDate(String uvtDate) {
		this.uvtDate = uvtDate;
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

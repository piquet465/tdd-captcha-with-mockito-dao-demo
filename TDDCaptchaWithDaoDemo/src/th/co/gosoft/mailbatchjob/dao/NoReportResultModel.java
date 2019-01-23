package th.co.gosoft.mailbatchjob.dao;

public class NoReportResultModel {
	private int assignPlanId;
	private String storeId;
	private int resultId;
	private String resultLastUpdateTimestamp;
	
	public int getAssignPlanId() {
		return assignPlanId;
	}
	public void setAssignPlanId(int assignPlanId) {
		this.assignPlanId = assignPlanId;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public int getResultId() {
		return resultId;
	}
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	public String getResultLastUpdateTimestamp() {
		return resultLastUpdateTimestamp;
	}
	public void setResultLastUpdateTimestamp(String resultLastUpdateTimestamp) {
		this.resultLastUpdateTimestamp = resultLastUpdateTimestamp;
	}
}


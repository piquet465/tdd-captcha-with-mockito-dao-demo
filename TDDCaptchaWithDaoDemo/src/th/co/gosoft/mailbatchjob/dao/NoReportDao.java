package th.co.gosoft.mailbatchjob.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import th.co.gosoft.mailbatchjob.dao.NoReportResultModel;

public class NoReportDao {

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	public NoReportDao() {
		this.connection = null;
	}
	
	public NoReportDao(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
		this.connection = connection;
		this.preparedStatement = preparedStatement;
		this.resultSet = resultSet;
	}
    
	public List<NoReportResultModel> getNoReportList() {
		List<NoReportResultModel> modelList = new ArrayList<>();
		
		if (connection == null) {
			// TODO connect REAL DataSource here.
			// connection =  DatabaseUtils.createConnectionWithoutAutoCommit();
		}
        
        try {
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ASP.ASSIGN_PLAN_ID, ASP.STORE_ID ");
			sb.append(" , RES.RESULT_ID, RES.UPDATE_CURRENT_TIMESTAMP ");
			sb.append(" , RSD.RESULT_ID AS REPORT_SUM_DATA FROM ASSIGN_PLAN ASP ");
			sb.append("INNER JOIN RESULT RES ON RES.ASSIGN_PLAN_ID = ASP.ASSIGN_PLAN_ID ");
			sb.append("LEFT JOIN REPORT_SUM_DATA RSD ON RSD.RESULT_ID = RES.RESULT_ID ");
			sb.append("WHERE ASP.STATUS_ID = 9 ");
			sb.append(" AND RSD.RESULT_ID IS NULL ");
			sb.append(" AND RES.UPDATE_CURRENT_TIMESTAMP < (NOW() - INTERVAL 3 HOUR) ");
			preparedStatement = connection.prepareStatement(sb.toString());
            
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
		        NoReportResultModel model = new NoReportResultModel();
				model.setAssignPlanId(resultSet.getInt("ASSIGN_PLAN_ID"));
				model.setResultId(resultSet.getInt("RESULT_ID"));
				model.setResultLastUpdateTimestamp(resultSet.getString("UPDATE_CURRENT_TIMESTAMP"));
				model.setStoreId(resultSet.getString("STORE_ID"));
				modelList.add(model);
			}
        }
	    catch (Exception e) {
//			logger.error("Exception : " + e.getMessage());
//			DatabaseUtils.rollback(connection);
	    }
        finally {
//        	DatabaseUtils.closeAllConnection(resultSet, preparedStatement, connection);
        }
        
		return modelList;
	}
}


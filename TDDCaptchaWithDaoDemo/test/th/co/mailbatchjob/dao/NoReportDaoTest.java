package th.co.mailbatchjob.dao;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import th.co.gosoft.mailbatchjob.dao.NoReportDao;
import th.co.gosoft.mailbatchjob.dao.NoReportResultModel;

public class NoReportDaoTest {
	
	public static LinkedList<LinkedHashMap<String, String>> getDummyNoReportDaoDataHashMap() throws Exception {
		LinkedList<LinkedHashMap<String, String>> resultSetData = new LinkedList<LinkedHashMap<String, String>>();
		
		LinkedHashMap<String, String> temp;
		
		temp = new LinkedHashMap<String, String>();
		temp.put("ASSIGN_PLAN_ID", "1");
		temp.put("RESULT_ID", "1");
		temp.put("UPDATE_CURRENT_TIMESTAMP", "2019-01-01 10:00:01");
		temp.put("STORE_ID", "00001");
		resultSetData.add(temp);

		temp = new LinkedHashMap<String, String>();
		temp.put("ASSIGN_PLAN_ID", "2");
		temp.put("RESULT_ID", "2");
		temp.put("UPDATE_CURRENT_TIMESTAMP", "2019-01-01 10:00:02");
		temp.put("STORE_ID", "00002");
		resultSetData.add(temp);

		temp = new LinkedHashMap<String, String>();
		temp.put("ASSIGN_PLAN_ID", "3");
		temp.put("RESULT_ID", "3");
		temp.put("UPDATE_CURRENT_TIMESTAMP", "2019-01-01 10:00:03");
		temp.put("STORE_ID", "00003");
		resultSetData.add(temp);

		return resultSetData;
	}
	
	private DummyDaoResultSet resultSet;

	@Mock
	private Connection connection = Mockito.mock(Connection.class);
	
	@Mock
	private PreparedStatement preparedStatement = Mockito.mock(PreparedStatement.class);

	private final String DUMMY_TABLE_NAME = "DUMMY_TABLE";

	@Before
	public void setUp() throws SQLException {
		when(connection.prepareStatement(Mockito.anyString())).thenReturn(preparedStatement);
	}

	@Test
	public final void it_ShouldCall_connection_prepareStatement_Once() throws SQLException {
		NoReportDao noReportDao = new NoReportDao(connection, preparedStatement, resultSet);
		noReportDao.getNoReportList();
		
		verify(connection, times(1)).prepareStatement(anyString());
	}
	
	@Test
	public final void it_ShouldReturn_2_NoReportResultModel() throws Exception {
		resultSet = new DummyDaoResultSet(DUMMY_TABLE_NAME, getDummyNoReportDaoDataHashMap());
		Mockito.when(preparedStatement.executeQuery()).thenReturn(resultSet);

		NoReportDao noReportDao = new NoReportDao(connection, preparedStatement, resultSet);
		List<NoReportResultModel> actualList = noReportDao.getNoReportList();
		
		assertEquals(3, actualList.size());
	}
}

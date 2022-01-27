import java.util.List;

public class DataAnalyzerDAOImpl implements DataAnalyzerDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(DataAnalyzer account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DataAnalyzer account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DataAnalyzer get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DataAnalyzer> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

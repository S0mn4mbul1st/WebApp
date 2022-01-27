import java.util.List;

public class LogSharingDAOImpl implements LogSharingDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(LogSharing account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(LogSharing account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LogSharing get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<LogSharing> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

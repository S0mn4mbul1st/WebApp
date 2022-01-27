import java.util.List;

public class LogDAOImpl implements LogDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Log account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Log account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Log get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Log> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

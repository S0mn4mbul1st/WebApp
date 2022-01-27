import java.util.List;

public class AlertDAOImpl implements AlertDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Alert account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Alert account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Alert get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Alert> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

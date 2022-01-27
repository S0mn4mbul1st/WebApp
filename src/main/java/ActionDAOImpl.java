import java.util.List;

public class ActionDAOImpl implements ActionDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Action account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Action account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Action get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Action> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

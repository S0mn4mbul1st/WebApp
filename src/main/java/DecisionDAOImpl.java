import java.util.List;

public class DecisionDAOImpl implements DecisionDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Decision account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Decision account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Decision get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Decision> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

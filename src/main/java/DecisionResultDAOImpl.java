import java.util.List;

public class DecisionResultDAOImpl implements DecisionResultDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(DecisionResult account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DecisionResult account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DecisionResult get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DecisionResult> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

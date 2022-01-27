import java.util.List;

public class HomeDAOImpl implements HomeDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Home account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Home account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Home get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Home> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

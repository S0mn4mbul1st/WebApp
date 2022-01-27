import java.util.List;

public class AddAccountDAOImpl implements AddAccountDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(AddAccount account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(AddAccount account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AddAccount get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AddAccount> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

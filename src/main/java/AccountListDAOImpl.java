import java.util.List;

public class AccountListDAOImpl implements AccountListDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(AccountList account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(AccountList account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AccountList get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AccountList> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

import java.util.List;

public class AccountSettingDAOImpl implements AccountSettingDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(AccountSetting account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(AccountSetting account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AccountSetting get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AccountSetting> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

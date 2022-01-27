import java.util.List;

public class EnrolledVoiceListDAOImpl implements EnrolledVoiceListDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(EnrolledVoiceList account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(EnrolledVoiceList account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EnrolledVoiceList get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EnrolledVoiceList> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

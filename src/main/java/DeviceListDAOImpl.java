import java.util.List;

public class DeviceListDAOImpl implements DeviceListDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(DeviceList account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DeviceList account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DeviceList get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DeviceList> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

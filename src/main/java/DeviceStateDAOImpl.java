import java.util.List;

public class DeviceStateDAOImpl implements DeviceStateDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(DeviceState account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DeviceState account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DeviceState get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DeviceState> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

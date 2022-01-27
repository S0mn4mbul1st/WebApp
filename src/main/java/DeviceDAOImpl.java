import java.util.List;

public class DeviceDAOImpl implements DeviceDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Device account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Device account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Device get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Device> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

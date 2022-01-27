import java.util.List;

public class DeviceTypeDAOImpl implements DeviceTypeDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(DeviceType account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DeviceType account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DeviceType get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DeviceType> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

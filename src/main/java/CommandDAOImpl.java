import java.util.List;

public class CommandDAOImpl implements CommandDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Command account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Command account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Command get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Command> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

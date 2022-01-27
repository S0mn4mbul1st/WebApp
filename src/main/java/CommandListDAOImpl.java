import java.util.List;

public class CommandListDAOImpl implements CommandListDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(CommandList account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CommandList account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CommandList get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CommandList> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

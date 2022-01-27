import java.util.List;

public class PatternExtractionDAOImpl implements PatternExtractionDAO {

	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(PatternExtraction account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(PatternExtraction account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PatternExtraction get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PatternExtraction> list() {
		// TODO Auto-generated method stub
		return null;
	}

}

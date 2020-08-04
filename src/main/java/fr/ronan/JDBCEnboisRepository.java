package fr.ronan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("JDBCEnBoisRepository")
public class JDBCEnboisRepository implements EnboisRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final class EnboisMapper implements RowMapper<Enbois> {
		public Enbois mapRow(ResultSet rs, int rowNum) throws SQLException {
			Enbois teuber = new Enbois();
			teuber.setId(rs.getInt("id"));
			teuber.setLongueur(rs.getInt("longueur"));
			teuber.setLargeur(rs.getInt("largeur"));
			teuber.setMatiere(rs.getString("matiere"));
			return teuber;
		}
	}
	
	public Map<String, Object>	selectById(int id) {
		return jdbcTemplate.queryForMap("select * from enbois where id = ?", id);
	}
	
	public int save(Enbois enbois) {
		return jdbcTemplate.update("insert into enbois (id, longueur, largeur, matiere) values(?,?,?,?)", enbois.getId(), enbois.getLongueur(), enbois.getLargeur(), enbois.getMatiere());
	}

}

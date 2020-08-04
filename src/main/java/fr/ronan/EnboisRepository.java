package fr.ronan;

import java.util.Map;

public interface EnboisRepository {
	Map<String, Object>	selectById(int id);
	
	int save(Enbois enbois);
}

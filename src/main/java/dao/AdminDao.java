package dao;

import entities.Periodical;

public interface AdminDao {
	
	void addPeriodical(Periodical p);
	void deletePeriodicalByName(Periodical p);
	void updatePeriodicalByName(Periodical p);

}

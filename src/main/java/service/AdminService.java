package service;

import entities.Periodical;

public interface AdminService {
	
	void addPeriodicalInDB(Periodical periodical);
	void deletePeriodicalByNameFromDB(Periodical p);
	void updatePeriodicalByNameInDB(Periodical p); 
	

}

package service;

import dao.AdminDao;
import dao.AdminDaoImpl;
import entities.Periodical;

public class AdminServiceImpl implements AdminService{
	
	AdminDao adminDao = new AdminDaoImpl();

	public void addPeriodicalInDB(Periodical p) {
		adminDao.addPeriodical(p);
	}

	public void deletePeriodicalByNameFromDB(Periodical p) {
		adminDao.deletePeriodicalByName(p);		
	}

	public void updatePeriodicalByNameInDB(Periodical p) {
		adminDao.updatePeriodicalByName(p);		
	}

}

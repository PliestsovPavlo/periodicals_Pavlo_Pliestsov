package app;

import dao.UserDao;
import dao.UserDaoImpl;
import entities.Admin;
import entities.Periodical;
import entities.User;
import service.AdminService;
import service.AdminServiceImpl;

public class App {
	public static void main(String args[]) {
		Periodical p = new Periodical();
		p.setName("Alfabeth");
		p.setDescription("for kids");
		p.setPrice(9.9);
		p.setIsDeleted(false);
		AdminService adminService = new AdminServiceImpl();
		adminService.addPeriodicalInDB(p );
		
		
		User user = new User();
		user.setFirstName("aaa");
		user.setLastName("bbb");
		user.setIsDeleted(false);
		UserDao userDao = new UserDaoImpl();
		userDao.addUser(user);
		System.out.println(user.toString());
	}

}

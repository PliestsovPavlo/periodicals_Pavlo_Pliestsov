package dao;

import entities.Periodical;
import entities.User;

public interface UserDao {
	
	void addUser(User user);
	void addToBasket(Periodical periodical);
	void deleteFromBasket(Periodical periodical);

}

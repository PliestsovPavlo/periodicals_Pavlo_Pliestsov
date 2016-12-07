package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBC.JDBCUtils;
import entities.Periodical;
import entities.User;

public class UserDaoImpl implements UserDao{
	
	private Connection conn;
	private static final String ADD_USER = "insert into user (`first_name`, `last_name`, `is_deleted`) values (?,?,?)";
	private static final String ADD_BASKET = "insert into basket (`id_user`, `id_periodical`, `date_of_shipping`, `date_of_pay`) values (?,?,?,?)";
	private static final String DELETE_FROM_BASKET = "update basket set is_deleted = ? where id = ?";
	
	
	public UserDaoImpl() {
		conn = JDBCUtils.getConnection();
	}

	public void addUser(User user) {
		System.out.println("open in addUser method!");
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement(ADD_USER, PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, user.getFirstName());
			stmt.setString(2, user.getLastName());
			stmt.setBoolean(3, user.getIsDeleted());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()){
				int generatedId = rs.getInt(1);
				user.setId(generatedId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}try {
			stmt.close();
			System.out.println("closed in addUser method!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void addToBasket(Periodical periodical) {
		// TODO Auto-generated method stub
		
	}

	public void deleteFromBasket(Periodical periodical) {
		// TODO Auto-generated method stub
		
	}

}

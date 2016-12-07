package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBC.JDBCUtils;
import entities.Periodical;

public class AdminDaoImpl implements AdminDao{
	
	private Connection conn;
	private static final String ADD_PERIODICAL = "insert into periodical (`name`, `description`, `price`, `is_deleted`) values (?,?,?,?)";
	private static final String DELETE_PERIODICAL_BY_NAME = "update periodical set is_deleted = ? where name = ?";
	private static final String UPDATE_PRICE_BY_NAME = "update periodical set price = ? where name = ?";


	public AdminDaoImpl() {
		conn = JDBCUtils.getConnection();
	}

	public void addPeriodical(Periodical p) {
		System.out.println("open in addPeriodical method!");
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement(ADD_PERIODICAL, PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, p.getName());
			stmt.setString(2, p.getDescription());
			stmt.setDouble(3, p.getPrice());
			stmt.setBoolean(4, p.getIsDeleted());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()){
				int generatedId = rs.getInt(1);
				p.setId(generatedId);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}try {
			stmt.close();
			System.out.println("closed in addPeriodical method!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void deletePeriodicalByName(Periodical p) {

		System.out.println("open in deletePeriodical method!");
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement(DELETE_PERIODICAL_BY_NAME);
			stmt.setInt(1, 1);
			stmt.setString(2, p.getName());
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				System.out.println("closed in deletePeriodical method!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	public void updatePeriodicalByName(Periodical p) {
		System.out.println("opened in updatePeriodical method!");
		PreparedStatement stmt = null;
		try {
		stmt = conn.prepareStatement(UPDATE_PRICE_BY_NAME);
			stmt.setDouble(1, p.getPrice());
			stmt.setString(2, p.getName());
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				System.out.println("closed in updatePeriodical method!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}

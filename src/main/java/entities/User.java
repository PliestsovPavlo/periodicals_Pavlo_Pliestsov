package entities;

public class User {
	
	private Role role = Role.USER;
	private Integer id;
	private String firstName;
	private String lastName;
	private Boolean isDeleted;
	
	public User(){
		
	}
	
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	@Override
	public String toString() {
		return "User [role=" + role + ", id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", isDeleted=" + isDeleted + "]";
	}
	
	

}

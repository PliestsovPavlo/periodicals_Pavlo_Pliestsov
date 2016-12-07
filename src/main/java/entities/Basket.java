package entities;

import java.util.Date;

public class Basket {
	
	private Integer id;
	private Integer idUser;
	private Integer idPeriodical;
	private Date dateOfShipping;
	private Date dateOfPay;
	
	public Basket(){
		
	}
	
	public Basket(Integer id, Integer idUser, Integer idPeriodical, Date dateOfShipping, Date dateOfPay) {
		super();
		this.id = id;
		this.idUser = idUser;
		this.idPeriodical = idPeriodical;
		this.dateOfShipping = dateOfShipping;
		this.dateOfPay = dateOfPay;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	public Integer getIdPeriodical() {
		return idPeriodical;
	}
	public void setIdPeriodical(Integer idPeriodical) {
		this.idPeriodical = idPeriodical;
	}
	public Date getDateOfShipping() {
		return dateOfShipping;
	}
	public void setDateOfShipping(Date dateOfShipping) {
		this.dateOfShipping = dateOfShipping;
	}
	public Date getDateOfPay() {
		return dateOfPay;
	}
	public void setDateOfPay(Date dateOfPay) {
		this.dateOfPay = dateOfPay;
	}
	
	
	@Override
	public String toString() {
		return "Basket [id=" + id + ", idUser=" + idUser + ", idPeriodical=" + idPeriodical + ", dateOfShipping="
				+ dateOfShipping + ", dateOfPay=" + dateOfPay + "]";
	}
	
	
	
}

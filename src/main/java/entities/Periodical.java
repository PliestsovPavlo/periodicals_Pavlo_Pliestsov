package entities;


public class Periodical {
	
	private Integer id;
	private String name;
	private String description;
	private Double price;
	private Boolean isDeleted;
	
	public Periodical(){
		
	}

	public Periodical(Integer id, String name, String description, Double price, Boolean isDeleted) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.isDeleted = isDeleted;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Periodical [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", isDeleted=" + isDeleted + "]";
	}
	
	
}

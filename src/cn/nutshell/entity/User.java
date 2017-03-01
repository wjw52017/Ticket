package cn.nutshell.entity;

public class User {
	private String id;
	private String phone;
	private String password;
	private String name;
	private String self_id;			//…Ì∑›÷§∫≈
	private String type;

	
	public String getself_id() {
		return self_id;
	}

	public void set_selfid(String self_id) {
		this.self_id = self_id;
	}

	public User(String id) {
		this.id = id;
	}
	
	public User() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

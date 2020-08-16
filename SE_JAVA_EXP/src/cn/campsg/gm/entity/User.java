package cn.campsg.gm.entity;

public class User {
	private int id;
	private String loginName;
	private String password;
	private String gender;
	private String name;
	private int age;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLoginName() {
		return loginName;
	}


	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	

	public User() {
		super();
	}


	public User(int id, String loginName, String password, String gender,
			String name, int age) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	
}

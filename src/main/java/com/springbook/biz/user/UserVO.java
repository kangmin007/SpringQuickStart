package com.springbook.biz.user;

public class UserVO {
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}
	private String id;
	private String password;
	private String name;
	private String role;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	//toString 오버라이딩 함! option + commmand + S로 설정함.
	
	
	
}

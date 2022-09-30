package com.spring.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long user_id;
    @javax.validation.constraints.NotEmpty
    private String firstName;
    @javax.validation.constraints.NotEmpty
    private String lastName;
    @javax.validation.constraints.NotEmpty(message = "Email should not be empty")
    @javax.validation.constraints.Email
    private String email;
    @javax.validation.constraints.NotEmpty(message = "Password should be empty")
    private String password;
    public UserDto() {
		//TODO Auto-generated constructor stub
	}
	public UserDto(@javax.validation.constraints.NotEmpty String firstName,
			@javax.validation.constraints.NotEmpty String lastName,
			@javax.validation.constraints.NotEmpty(message = "Email should not be empty") @javax.validation.constraints.Email String email,
			@javax.validation.constraints.NotEmpty(message = "Password should be empty") String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	public UserDto(Long id, @javax.validation.constraints.NotEmpty String firstName,
			@javax.validation.constraints.NotEmpty String lastName,
			@javax.validation.constraints.NotEmpty(message = "Email should not be empty") @javax.validation.constraints.Email String email,
			@javax.validation.constraints.NotEmpty(message = "Password should be empty") String password) {
		super();
		this.user_id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	public Long getId() {
		return user_id;
	}
	public void setId(Long id) {
		this.user_id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}

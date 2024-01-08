package com.intellectdesign.user.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequest {
	
	private Integer userId;
	private String name;
	private String email;
	private String password;
	private String gender;
	private LocalDate dob;
	private Long phnNo;
	private Long ssn;
	private String userType;
	
	private boolean passwordChanged;

}

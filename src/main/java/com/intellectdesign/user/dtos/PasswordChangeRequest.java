package com.intellectdesign.user.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasswordChangeRequest {
	
	
	private Integer userId;
	private String email;
	private String password;
	private String confirmPassword;

}

package com.intellectdesign.user.reponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {

	private Integer userId;
	private String name;
	private String userType;
	private DashboardResponse dashboardResponse;
	private boolean isValidLogin;
	private boolean passwordChanged;

}

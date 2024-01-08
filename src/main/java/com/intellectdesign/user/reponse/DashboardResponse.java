package com.intellectdesign.user.reponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DashboardResponse {

	private Integer plansCount;
	private Long citizenApprovedCount;
	private Long deniedCount;
	private Double totalBenefitAmount;

}

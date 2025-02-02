package com.p1k.p1kGram.web.dto.user;

import com.p1k.p1kGram.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserProfileRespDto {

	private boolean followState; // 구독 정보
	private int followCount;
	private int imageCount;
	private User user;
	
	//save가 아니라서 toEntity가 필요없다.
}
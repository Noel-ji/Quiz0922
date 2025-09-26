package com.memory.treasures.demo.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

	 @NotBlank(message = "사용자명을 입력해주세요.")
	 private String username;

	 @NotBlank(message = "비밀번호를 입력해주세요.")
	 private String password;
	 
	 private boolean remeberMe;
}

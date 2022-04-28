package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response {
	private boolean is_success;
	private String user_id;
	private String email;
	private String roll_number;
	private int[] numbers;
	private String[]  alphabets;
	
	public void setIs_success(boolean is_success) {
		this.is_success = is_success;
	}

	public boolean isIs_success() {
		return is_success;
	}
	
	
	
	
}




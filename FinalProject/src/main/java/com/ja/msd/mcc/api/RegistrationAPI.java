package com.ja.msd.mcc.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ja.msd.mcc.domain.Registration;

@RestController
@RequestMapping("/registration")
public class RegistrationAPI {

	@GetMapping
	public String getAll() {
		String response = "[ ";
		for (int i = 0; i < list.size(); i++) {
			response += list.get(i).toJSON();
			if (i + 1 < list.size()) {
				response += ", ";
			}
		}
		response += " ]";
		return response;
	}

	@GetMapping("/{registrationId}")
	public String getRegistrationById(@PathVariable("registrationId") long id) {
		String response = "{}";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				response = list.get(i).toJSON();
			}
		}
		return response;
	}
}
}
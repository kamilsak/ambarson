package com.sak.ambarlar.util;

import org.springframework.data.domain.Page;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;

import com.sak.ambarlar.model.Bavul;

public class MethodUtils {
	public static void pageModel(Model model, Page<?> pages) {
		int current = pages.getNumber() + 1;
		int begin = Math.max(1, current - 5);
		int end = Math.min(begin + 5, pages.getTotalPages());
		
		model.addAttribute("end", end);
		model.addAttribute("begin", begin);
		model.addAttribute("current", current);
		model.addAttribute("totalPages", pages.getTotalPages());
		model.addAttribute("totalElements", pages.getTotalElements());
	}
	
	public static String convertString(String text) {
		String formattedText = "";
		for(Character character : text.toCharArray()) {
			if(Character.isUpperCase(character)) {
				formattedText = formattedText+" "+character;
			} else {
				formattedText = formattedText+character;
			}
			formattedText = formattedText.substring(0, 1).toUpperCase()+formattedText.substring(1, formattedText.length());
		}
		return formattedText.trim();
	}
	public static Bavul bavul() {
		SecurityContext securityContext = SecurityContextHolder.getContext();
		Bavul sis = null;
		if(null != securityContext.getAuthentication()){
			sis = (Bavul) securityContext.getAuthentication().getPrincipal();
		}
		return sis;
	}
}

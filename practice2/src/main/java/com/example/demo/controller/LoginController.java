package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.SigninForm;

@Controller
public class LoginController {
	@GetMapping("/admin/login")
    public String detail(Model model) {
        model.addAttribute("signinForm", new SigninForm()); // 空のフォームを初期化
		return "/admin/login";
	}
	
	@RequestMapping("/logout")
    String afterLogout() {
        return "logout";
	}
}

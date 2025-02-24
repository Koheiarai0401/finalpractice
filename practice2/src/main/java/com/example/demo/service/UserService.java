package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // Userエンティティを取得・ユーザ情報の検索 emailとRepositoryのStringが紐付きている
        User user = userRepository.findById(email)
            .orElseThrow(() -> {
                System.out.println("Email:" + email + "が見つかりません。");
                return new UsernameNotFoundException(email);
            });

        return org.springframework.security.core.userdetails.User.withUsername(user.getEmail())
                .password(user.getPassword())
                .roles("USER")
                .build();
    }
}


package com.fw.studyplatform.core.service.impl;

import com.fw.studyplatform.core.modals.CustomUserDetails;
import com.fw.studyplatform.core.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.fw.studyplatform.core.modals.User;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //模拟数据库
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123");
        return new CustomUserDetails(user);
    }
}

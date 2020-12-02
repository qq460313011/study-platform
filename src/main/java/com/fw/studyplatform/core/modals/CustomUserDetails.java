package com.fw.studyplatform.core.modals;

import java.util.Collections;

public class CustomUserDetails extends org.springframework.security.core.userdetails.User {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CustomUserDetails(User user) {
        super(user.getUsername(), user.getPassword(), true, true, true, true, Collections.EMPTY_LIST);
        this.user = user;
    }
}

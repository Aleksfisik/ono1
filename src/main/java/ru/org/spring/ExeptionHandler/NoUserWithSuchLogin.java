package ru.org.spring.ExeptionHandler;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

class NoUserWithSuchLogin extends UsernameNotFoundException {

    public NoUserWithSuchLogin(String msg) {
        super(msg);
    }
}

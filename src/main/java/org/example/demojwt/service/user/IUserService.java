package org.example.demojwt.service.user;

import org.example.demojwt.model.User;
import org.example.demojwt.service.IGenericService;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUserService extends IGenericService<User> {
    UserDetails loadUserByUsername(String username);

    User findByUsername(String username);
}

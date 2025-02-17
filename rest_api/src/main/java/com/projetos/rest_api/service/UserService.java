package com.projetos.rest_api.service;

import com.projetos.rest_api.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}

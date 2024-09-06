package org.example.demojwt.service.role;

import org.example.demojwt.model.Role;
import org.example.demojwt.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public Role save(Role role) {
        roleRepository.save(role);
        return role;
    }

    @Override
    public void delete(Role role) {
        roleRepository.delete(role);
    }
}

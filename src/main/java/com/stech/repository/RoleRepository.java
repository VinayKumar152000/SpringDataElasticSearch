package com.stech.repository;


import com.stech.model.Role;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RoleRepository extends ElasticsearchRepository<Role, String> {

}
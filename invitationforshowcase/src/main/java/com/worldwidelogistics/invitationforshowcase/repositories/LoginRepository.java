package com.worldwidelogistics.invitationforshowcase.repositories;


import java.util.List;
import java.util.Optional;

import com.worldwidelogistics.invitationforshowcase.models.LoginModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<LoginModel, Long> {
    List<LoginModel> findAll();
    Optional<LoginModel> findById(Long id);    
    LoginModel findByEmail(String email);
}
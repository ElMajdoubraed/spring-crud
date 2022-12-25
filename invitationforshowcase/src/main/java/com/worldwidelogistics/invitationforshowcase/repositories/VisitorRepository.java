package com.worldwidelogistics.invitationforshowcase.repositories;

import java.util.List;
import java.util.Optional;

import com.worldwidelogistics.invitationforshowcase.models.VisitorTModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends CrudRepository<VisitorTModel, Long> {
    List<VisitorTModel> findAll();
    Optional<VisitorTModel> findById(Long id);
    
}
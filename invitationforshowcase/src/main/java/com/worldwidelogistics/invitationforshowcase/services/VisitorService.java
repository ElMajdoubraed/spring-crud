package com.worldwidelogistics.invitationforshowcase.services;

import java.util.List;
import java.util.Optional;

import com.worldwidelogistics.invitationforshowcase.models.VisitorTModel;
import com.worldwidelogistics.invitationforshowcase.repositories.VisitorRepository;

import org.springframework.stereotype.Service;

@Service
public class VisitorService {
    private VisitorRepository vistorRepo;
    public VisitorService(VisitorRepository initialVisitRepo) {
        this.vistorRepo = initialVisitRepo;
    }

    public List<VisitorTModel> showAllUser(){
        return vistorRepo.findAll();
    }
    public void createAVisitor(VisitorTModel newVisitor) {
        vistorRepo.save(newVisitor);
    }

    public VisitorTModel getByIdAVisitor(Long id) {
        Optional<VisitorTModel> aVisitor = vistorRepo.findById(id);
        if(aVisitor.isPresent()) {
            return aVisitor.get();
        }
        return null;
    }
    public void updateAVisitor(VisitorTModel newVisitor) {
        vistorRepo.save(newVisitor);
    }
    public void deleteByID(Long id) {
        vistorRepo.deleteById(id);
    }

    
    
}
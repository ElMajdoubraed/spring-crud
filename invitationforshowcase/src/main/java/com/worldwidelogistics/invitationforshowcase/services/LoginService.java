package com.worldwidelogistics.invitationforshowcase.services;

import java.util.List;
import java.util.Optional;

import com.worldwidelogistics.invitationforshowcase.models.LoginModel;
import com.worldwidelogistics.invitationforshowcase.models.VisitorTModel;
import com.worldwidelogistics.invitationforshowcase.repositories.LoginRepository;
import com.worldwidelogistics.invitationforshowcase.repositories.VisitorRepository;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private LoginRepository loginRepo;
    public LoginService(LoginRepository initialVisitRepo) {
        this.loginRepo = initialVisitRepo;
    }

    public List<LoginModel> showAllUser(){
        return loginRepo.findAll();
    }
    public void createAVisitor(LoginModel newVisitor) {
        loginRepo.save(newVisitor);
    }

    public LoginModel getByIdAVisitor(Long id) {
        Optional<LoginModel> aVisitor = loginRepo.findById(id);
        if(aVisitor.isPresent()) {
            return aVisitor.get();
        }
        return null;
    }
    public void updateAVisitor(LoginModel newVisitor) {
        loginRepo.save(newVisitor);
    }
    public void deleteByID(Long id) {
        loginRepo.deleteById(id);
    }

}

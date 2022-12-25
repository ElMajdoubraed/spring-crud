package com.worldwidelogistics.invitationforshowcase.controllers;


import javax.validation.Valid;

import com.worldwidelogistics.invitationforshowcase.models.VisitorTModel;
import com.worldwidelogistics.invitationforshowcase.services.VisitorService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class VisitorController {
    private VisitorService visitorSer;
    public VisitorController(VisitorService initialVisitorSer){
        this.visitorSer = initialVisitorSer;
    }    

    
    @GetMapping("/visitorwelcomescreen")
    public String showWelcomeScreen() {
        // System.out.println("I was here in controller");
        return "index";
    }

    @GetMapping("/visitor")
    public String showAllVisitors(Model model) {
        model.addAttribute("listOfvisitors", visitorSer.showAllUser());
        return "viewVisitors";
        
    }
    @GetMapping("/registrationviewpage")
    public String registrationViewForm(@ModelAttribute("visitorObject") VisitorTModel visitor) {
        return "registerVisitor";
    }

    @PostMapping("/register")
    public String registerAVisitor(@Valid @ModelAttribute("visitorObject") VisitorTModel newVisitor, BindingResult result) {
        if(result.hasErrors()) {
            return "registerVisitor";
        }
        visitorSer.createAVisitor(newVisitor);
        return "redirect:/visitor";
    }
    @GetMapping("/editview/{id}")
    public String viewAVisitorByID(@PathVariable("id") Long id, Model model) {
        VisitorTModel aVisitor = visitorSer.getByIdAVisitor(id);
        model.addAttribute("aSingleVisitorObject", aVisitor);
        return "editVisitor";
    }
    @PostMapping("/edit/{id}")
    public String editAVisitor(@PathVariable("id") Long id, @Valid @ModelAttribute("aSingleVisitorObject") VisitorTModel updateCurrentUser, BindingResult result) {
        if(result.hasErrors()) {
            return "editVisitor";
        }
        visitorSer.updateAVisitor(updateCurrentUser);
        return "redirect:/visitor";

    }
    @PostMapping("/remove/{id}")
    public String removeAVisitor(@PathVariable("id") Long id) {
        visitorSer.deleteByID(id);
        return "redirect:/visitor";
    }
    
  
    
    
    
}
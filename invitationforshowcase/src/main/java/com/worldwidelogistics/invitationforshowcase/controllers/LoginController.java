package com.worldwidelogistics.invitationforshowcase.controllers;


import java.util.List;

import javax.validation.Valid;

import com.worldwidelogistics.invitationforshowcase.models.LoginModel;
import com.worldwidelogistics.invitationforshowcase.models.VisitorTModel;
import com.worldwidelogistics.invitationforshowcase.services.LoginService;
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
public class LoginController {
    private LoginService visitorSer;
    public LoginController(LoginService initialVisitorSer){
        this.visitorSer = initialVisitorSer;
    }    

    @GetMapping("/login")
    public String showLoginScreen(@ModelAttribute("visitorObject") LoginModel visitor) {
        // System.out.println("I was here in controller");
        return "login";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("visitorObject") LoginModel newVisitor, BindingResult result){
        //visitorSer.createAVisitor(newVisitor);
        List<LoginModel> list = visitorSer.showAllUser();
        for (int i = 0; i< list.size(); i++){
            if(list.get(i).getEmail().equals(newVisitor.getEmail()) ) {
                if(list.get(i).getPassword().equals(newVisitor.getPassword())) {
                    //System.out.println("jawk behyy");
                    return "redirect:/home";
                }else{
                    //System.out.println("mdp ghalet");
                    return "redirect:/login";
                }
            } 
        }
        //System.out.println("famach compte");
        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout(){
        return "redirect:/";
    }


    /*
     * 
    @GetMapping("/login/login")
    public String showWelcomeScreen() {
        // System.out.println("I was here in controller");
        return "login";
    }

    @GetMapping("/login")
    public String login(@ModelAttribute("visitorObject") VisitorTModel visitor) {
        // System.out.println("I was here in controller");
        return "login";
    }

    @GetMapping("/visitor")
    public String showAllVisitors(Model model) {
        model.addAttribute("listOfvisitors", visitorSer.showAllUser());
        return "viewVisitors";
        
    }
    @GetMapping("/registrationviewpage")
    public String registrationViewForm(@ModelAttribute("visitorObject") LoginModel visitor) {
        return "registerVisitor";
    }

    @PostMapping("/register")
    public String registerAVisitor(@Valid @ModelAttribute("visitorObject") LoginModel newVisitor, BindingResult result) {
        if(result.hasErrors()) {
            return "registerVisitor";
        }
        visitorSer.createAVisitor(newVisitor);
        return "redirect:/visitor";
    }
    @GetMapping("/editview/{id}")
    public String viewAVisitorByID(@PathVariable("id") Long id, Model model) {
        LoginModel aVisitor = visitorSer.getByIdAVisitor(id);
        model.addAttribute("aSingleVisitorObject", aVisitor);
        return "editVisitor";
    }
    @PostMapping("/edit/{id}")
    public String editAVisitor(@PathVariable("id") Long id, @Valid @ModelAttribute("aSingleVisitorObject") LoginModel updateCurrentUser, BindingResult result) {
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
     */

}

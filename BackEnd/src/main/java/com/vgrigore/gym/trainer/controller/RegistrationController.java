package com.vgrigore.gym.trainer.controller;

import com.vgrigore.gym.trainer.model.UserAccount;
import com.vgrigore.gym.trainer.service.UserAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Controlled handles registration of new customers
 *
 */
@RestController
@RequestMapping("/signIn")
public class RegistrationController {

    private UserAccountServiceImpl accountService;

    @Autowired
    public RegistrationController(UserAccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(method = GET)
    public UserAccount startSignIn() {
        // return simple json presents UserAccount
        return null;
    }

    @RequestMapping(method = POST)
    public boolean handleSignIn() {
//        accountService.createUser();
        return false;
    }


    public UserAccountServiceImpl getAccountService() {
        return accountService;
    }
}

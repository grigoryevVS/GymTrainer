package com.vgrigore.gym.trainer.controller;

import com.vgrigore.gym.trainer.model.UserAccount;
import com.vgrigore.gym.trainer.service.UserAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Controller used on startpage of the application
 * Presents entry data to the customer
 * With action points as "Tiles".
 *
 */
@RestController
@RequestMapping("/start")
public class StartAppController {

    private UserAccountServiceImpl accountService;

    @Autowired
    public StartAppController(UserAccountServiceImpl accountService) {
        this.accountService = accountService;
    }


    @RequestMapping(method = GET)
    public UserAccount getStartPage() {
        return new UserAccount();
    }

    public UserAccountServiceImpl getAccountService() {
        return accountService;
    }
}

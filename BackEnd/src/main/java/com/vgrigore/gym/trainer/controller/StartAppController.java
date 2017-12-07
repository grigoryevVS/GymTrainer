package com.vgrigore.gym.trainer.controller;

import com.vgrigore.gym.trainer.model.user.UserAccount;
import com.vgrigore.gym.trainer.service.UserAccountServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(StartAppController.class);

    @Autowired
    public StartAppController(UserAccountServiceImpl accountService) {
        this.accountService = accountService;
    }


    @RequestMapping(method = GET, value = "/{userId}")
    public UserAccount getStartPage(@PathVariable("userId") long userId) {
        UserAccount userAccount = accountService.findUserById(userId);
        LOGGER.info("User Account: {0}", userAccount);
        return userAccount;
    }

    public UserAccountServiceImpl getAccountService() {
        return accountService;
    }
}

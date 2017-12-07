package com.vgrigore.gym.trainer.controller;

import com.vgrigore.gym.trainer.model.user.UserAccount;
import com.vgrigore.gym.trainer.model.user.UserCredentials;
import com.vgrigore.gym.trainer.service.UserAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Controller handles login activities of the user
 *
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    private UserAccountService accountService;

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);


    @Autowired
    public LoginController(UserAccountService accountService) {
        this.accountService = accountService;
    }


    @RequestMapping(method = GET)
    public UserCredentials getLoginData() {
        LOGGER.debug("User came to login page.");
        return new UserCredentials();
    }

    @RequestMapping(method = POST)
    public ResponseEntity handleLogin(@Validated @RequestBody UserCredentials credentials) {

        LOGGER.debug("User with login: {0} tries authentication", credentials.getLogin());
        Optional<UserAccount> userAccount = accountService.findUserByCredentials(credentials);

        return userAccount.<ResponseEntity>map(user -> new ResponseEntity<>(user, OK))
                .orElseGet(() -> new ResponseEntity<>(NOT_FOUND));
    }

    private boolean isValidCredentials(UserCredentials credentials) {
        return credentials == null || credentials.getLogin() != null;
    }

    public UserAccountService getAccountService() {
        return accountService;
    }
}

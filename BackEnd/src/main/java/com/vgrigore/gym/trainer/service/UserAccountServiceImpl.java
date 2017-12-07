package com.vgrigore.gym.trainer.service;

import com.vgrigore.gym.trainer.dao.UserAccountRepository;
import com.vgrigore.gym.trainer.model.user.UserAccount;
import com.vgrigore.gym.trainer.model.user.UserCredentials;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementation for userAccount handling
 *
 */
@Service
public class UserAccountServiceImpl implements UserAccountService {


    private UserAccountRepository accountRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserAccountRepository.class);

    @Autowired
    public UserAccountServiceImpl(UserAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public UserAccount findUserById(long userId) {
        return null;
    }

    @Override
    public Optional<UserAccount> findUserByCredentials(UserCredentials credentials) {
        Optional<UserAccount> userAccount = Optional.ofNullable(accountRepository.findUserByCredentials(credentials));
        if (!userAccount.isPresent()) {
            LOGGER.error("No user account found for credentials: {0}", credentials);
        }
        return userAccount;
    }


    public UserAccountRepository getAccountRepository() {
        return accountRepository;
    }
}

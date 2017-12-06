package com.vgrigore.gym.trainer.service;

import com.vgrigore.gym.trainer.model.UserAccount;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementation for userAccount handling
 *
 */
@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Override
    public Optional<UserAccount> findUserById(long userId) {
        return null;
    }

}

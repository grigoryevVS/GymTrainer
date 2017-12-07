package com.vgrigore.gym.trainer.service;

import com.vgrigore.gym.trainer.model.user.UserAccount;
import com.vgrigore.gym.trainer.model.user.UserCredentials;

import java.util.Optional;

/**
 * Interface defines interaction
 * with user account
 *
 */
public interface UserAccountService {

    /**
     * Find user by passed userId
     *
     * @param userId - userId
     * @return - UserAccount VO
     */
    UserAccount findUserById(long userId);

    /**
     * Find user account by passed login/password data
     *
     * @param credentials - auth credentials for user
     * @return - Optional<UserAccount> - with account or empty
     */
    Optional<UserAccount> findUserByCredentials(UserCredentials credentials);
}

package com.vgrigore.gym.trainer.service;

import com.vgrigore.gym.trainer.model.UserAccount;

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
     * @return - Optional which contain UserAccount VO
     */
    Optional<UserAccount> findUserById(long userId);

}

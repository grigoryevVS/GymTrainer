package com.vgrigore.gym.trainer.dao;

import com.vgrigore.gym.trainer.model.user.UserAccount;
import com.vgrigore.gym.trainer.model.user.UserCredentials;
import org.springframework.stereotype.Repository;

/**
 * Repository which handles user accounts
 *
 */
@Repository
public class UserAccountRepository {

    public UserAccount findUserByCredentials(UserCredentials credentials) {
        return null;
    }
}

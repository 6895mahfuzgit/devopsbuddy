package com.devopsbuddy.backend.presistence.repositories;

import com.devopsbuddy.backend.presistence.domian.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MahfuzCSE'11 on 20-Sep-16.
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}

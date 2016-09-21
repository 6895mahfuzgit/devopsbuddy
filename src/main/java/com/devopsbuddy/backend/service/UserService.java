package com.devopsbuddy.backend.service;

import com.devopsbuddy.backend.presistence.domian.backend.Plan;
import com.devopsbuddy.backend.presistence.domian.backend.User;
import com.devopsbuddy.backend.presistence.domian.backend.UserRole;
import com.devopsbuddy.backend.presistence.repositories.PlanRepository;
import com.devopsbuddy.backend.presistence.repositories.RoleRepository;
import com.devopsbuddy.backend.presistence.repositories.UserRepository;
import com.devopsbuddy.enums.PlanEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * Created by MahfuzCSE'11 on 22-Sep-16.
 */
@Service
@Transactional(readOnly = true)
public class UserService {


    @Autowired
    private PlanRepository planRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;


    @Transactional
    public User createUser(User user, PlanEnum planEnum, Set<UserRole> userRoles) {

        Plan plan = new Plan(planEnum);

        if (!planRepository.exists(planEnum.getId())) {

            plan = planRepository.save(plan);
        }
        user.setPlan(plan);
        for (UserRole userRole : userRoles) {

            roleRepository.save(userRole.getRole());
        }

        user.getUserRoles().addAll(userRoles);

        user = userRepository.save(user);

        return user;


    }

}

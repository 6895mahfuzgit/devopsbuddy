package com.devopsbuddy.backend.presistence.repositories;

import com.devopsbuddy.backend.presistence.domian.backend.Plan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MahfuzCSE'11 on 20-Sep-16.
 */
@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer> {
}

package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Planning;

public interface PlanningRepository extends CrudRepository<Planning, Integer> {

}

package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher,Integer> {

}

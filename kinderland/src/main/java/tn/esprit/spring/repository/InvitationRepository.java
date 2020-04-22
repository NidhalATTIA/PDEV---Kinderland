package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.entity.Invitation;

public interface InvitationRepository extends CrudRepository<Invitation, Long>{

}

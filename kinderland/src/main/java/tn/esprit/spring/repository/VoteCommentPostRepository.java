package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entity.VoteCommentPost;


public interface VoteCommentPostRepository extends CrudRepository<VoteCommentPost, Long>{
	
	@Query("SELECT COUNT(r) FROM VoteCommentPost r join User u on r.ups=u.IdUser WHERE u.IdUser=:reporteu AND r.Treated=1")
    public Long CountReclamationReportedUser (@Param("reporteu")Long iduser2);

}

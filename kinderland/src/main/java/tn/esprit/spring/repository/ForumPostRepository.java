package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entity.ForumPost;

public interface ForumPostRepository extends CrudRepository<ForumPost, Long>{
	
	@Modifying
    @Transactional
    @Query("UPDATE ForumPost e SET e.TextPost=:TextPost1 where e.IdPost=:PostId")
    public void UpdateForumPost(@Param("TextPost1")String TextPost, @Param("PostId")Long PostId);

}

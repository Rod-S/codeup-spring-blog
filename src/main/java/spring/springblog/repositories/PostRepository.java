package spring.springblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springblog.models.Post;

public interface PostRepository extends JpaRepository<Post,Long> {

}

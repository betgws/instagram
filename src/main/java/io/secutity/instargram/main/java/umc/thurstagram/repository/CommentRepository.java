package umc.thurstagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.thurstagram.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}

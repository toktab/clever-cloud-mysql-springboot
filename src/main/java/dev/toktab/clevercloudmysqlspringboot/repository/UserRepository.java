package dev.toktab.clevercloudmysqlspringboot.repository;

import dev.toktab.clevercloudmysqlspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

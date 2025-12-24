package aya.microservices.messagingconsumer.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aya.microservices.messagingconsumer.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
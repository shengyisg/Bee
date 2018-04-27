package com.bee.repository;

import com.bee.entity.BeeUser;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the BeeUser entity.
 */
@Repository
public interface BeeUserRepository extends JpaRepository<BeeUser, Long> {

    Optional<BeeUser> findOneByActivationKey(String activationKey);

    List<BeeUser> findAllByActivatedIsFalseAndCreatedDateBefore(Instant dateTime);

    Optional<BeeUser> findOneByResetKey(String resetKey);

    Optional<BeeUser> findOneByEmailIgnoreCase(String email);

    Optional<BeeUser> findOneByLogin(String login);

    @EntityGraph(attributePaths = "roles")
    Optional<BeeUser> findOneWithRolesById(Long id);

    @EntityGraph(attributePaths = "roles")
    Optional<BeeUser> findOneWithRolesByLogin(String Login);

    BeeUser findByLogin(String Login);

}

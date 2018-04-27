package com.bee.repository;

import com.bee.entity.BeeUser;
import com.bee.entity.PersistentToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Spring Data JPA repository for the PersistentToken entity.
 */
public interface PersistentTokenRepository extends JpaRepository<PersistentToken, String> {

    List<PersistentToken> findByUser(BeeUser user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);

}

package kz.bitlab.techorda.finalproject.repository;

import kz.bitlab.techorda.finalproject.model.Singer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface SingerRepository extends JpaRepository<Singer,Long> {
}

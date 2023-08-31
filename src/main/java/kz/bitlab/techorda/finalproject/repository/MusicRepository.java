package kz.bitlab.techorda.finalproject.repository;

import kz.bitlab.techorda.finalproject.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MusicRepository extends JpaRepository<Music,Long> {
@Query("select  m from Music m where  m.singer.id =:singerId")
    List<Music> getMusicsBySingerId(@Param("singerId") Long singerId);


}

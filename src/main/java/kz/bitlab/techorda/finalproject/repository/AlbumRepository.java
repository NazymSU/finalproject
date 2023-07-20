package kz.bitlab.techorda.finalproject.repository;

import kz.bitlab.techorda.finalproject.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album,Long> {
}

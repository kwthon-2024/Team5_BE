package beanpowder.clubapp.repository;

import beanpowder.clubapp.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClubRepository extends JpaRepository<Club, Integer> {
    List<Club> findByCategory(String category); // 카테고리별 조회
}

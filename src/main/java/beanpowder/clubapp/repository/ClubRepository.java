package beanpowder.clubapp.repository;

import beanpowder.clubapp.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
    // 카테고리를 기준으로 동아리 리스트를 반환
    List<Club> findByCategory(String category);
}

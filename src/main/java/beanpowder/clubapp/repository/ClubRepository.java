package beanpowder.clubapp.repository;

import beanpowder.clubapp.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
    // 카테고리와 목적을 기준으로 동아리를 필터링
    List<Club> findByCategoryAndPurpose(String category, String purpose);
}

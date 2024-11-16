package beanpowder.clubapp.service;

import beanpowder.clubapp.entity.Club;
import beanpowder.clubapp.repository.ClubRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {

    private final ClubRepository clubRepository;

    public RecommendationService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    // 카테고리로 추천 동아리 필터링
    public List<Club> getRecommendedClubsByCategory(String category) {
        return clubRepository.findByCategory(category); // 카테고리로 필터링
    }
}

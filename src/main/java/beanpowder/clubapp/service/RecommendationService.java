package beanpowder.clubapp.service;

import beanpowder.clubapp.dto.RecommendationRequest;
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

    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    public List<Club> getRecommendedClubs(RecommendationRequest request) {
        System.out.println("Finding clubs for category: " + request.getCategory());
        System.out.println("Finding clubs for purpose: " + request.getPurpose());

        return clubRepository.findByCategoryAndPurpose(
                request.getCategory(),
                request.getPurpose()
        );
    }
}

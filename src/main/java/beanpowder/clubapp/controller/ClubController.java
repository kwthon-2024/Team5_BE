package beanpowder.clubapp.controller;

import beanpowder.clubapp.dto.RecommendationRequest;
import beanpowder.clubapp.entity.Club;
import beanpowder.clubapp.service.RecommendationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    private final RecommendationService recommendationService;

    public ClubController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping
    public List<Club> getAllClubs() {
        return recommendationService.getAllClubs();
    }

    @PostMapping("/recommendations")
    public List<Club> getRecommendations(@RequestBody RecommendationRequest request) {
        // 디버깅: 요청 데이터 확인
        System.out.println("Received Category: " + request.getCategory());
        System.out.println("Received Purpose: " + request.getPurpose());

        return recommendationService.getRecommendedClubs(request);
    }
}

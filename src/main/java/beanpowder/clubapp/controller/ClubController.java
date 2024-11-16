package beanpowder.clubapp.controller;

import beanpowder.clubapp.entity.Club;
import beanpowder.clubapp.service.ClubService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    private final ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    // 전체 동아리 리스트 가져오기
    @GetMapping
    public List<Club> getAllClubs() {
        return clubService.getAllClubs();
    }

    // 카테고리로 추천 동아리 가져오기
    @GetMapping("/recommendations")
    public List<Club> getRecommendedClubsByCategory(@RequestParam String category) {
        return clubService.getClubsByCategory(category);
    }
}

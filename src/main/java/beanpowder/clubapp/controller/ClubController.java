package beanpowder.clubapp.controller;

import beanpowder.clubapp.entity.Club;
import beanpowder.clubapp.service.ClubService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    private final ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    // 모든 클럽 조회
    @GetMapping
    public List<Club> getAllClubs() {
        return clubService.getAllClubs();
    }

    // 카테고리에 따른 추천 클럽 조회
    @PostMapping("/recommendations")
    public List<Club> recommendClubs(@RequestBody String category) {
        return clubService.recommendClubs(category);
    }

    // 단일 클럽 조회
    @GetMapping("/{id}")
    public ResponseEntity<Club> getClubById(@PathVariable Integer id) {
        return ResponseEntity.ok(clubService.getClubById(id));
    }

    // 새 클럽 추가
    @PostMapping
    public Club createClub(@RequestBody Club club) {
        return clubService.createClub(club);
    }

    // 클럽 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClub(@PathVariable Integer id) {
        clubService.deleteClub(id);
        return ResponseEntity.noContent().build();
    }
}

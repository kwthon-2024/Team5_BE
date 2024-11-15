package beanpowder.clubapp.service;

import beanpowder.clubapp.entity.Club;
import beanpowder.clubapp.repository.ClubRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {

    private final ClubRepository clubRepository;

    public ClubService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    // 모든 클럽 조회
    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    // 카테고리에 따른 클럽 추천
    public List<Club> recommendClubs(String category) {
        return clubRepository.findByCategory(category);
    }

    // 단일 클럽 조회
    public Club getClubById(Integer id) {
        return clubRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Club not found"));
    }

    // 새 클럽 추가
    public Club createClub(Club club) {
        return clubRepository.save(club);
    }

    // 클럽 삭제
    public void deleteClub(Integer id) {
        clubRepository.deleteById(id);
    }
}

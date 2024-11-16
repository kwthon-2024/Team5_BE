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

    // 전체 동아리 리스트 반환
    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    // 카테고리로 동아리 추천
    public List<Club> getClubsByCategory(String category) {
        return clubRepository.findByCategory(category);
    }
}

package beanpowder.clubapp.dto;

public class RecommendationRequest {
    private String category; // 사용자 요청에서 전달받을 카테고리

    // 기본 생성자
    public RecommendationRequest() {}

    // 생성자
    public RecommendationRequest(String category) {
        this.category = category;
    }

    // Getter와 Setter
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

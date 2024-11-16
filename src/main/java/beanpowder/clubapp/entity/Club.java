package beanpowder.clubapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "new_clubs") // 데이터베이스 테이블과 매핑
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private String field;
    private String room;

    @Column(name = "membership_fee")
    private Integer membershipFee;

    @Column(name = "is_open")
    private Boolean isOpen;

    @Column(name = "image_url")
    private String imageUrl;

    public Club() {}

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Integer getMembershipFee() {
        return membershipFee;
    }

    public void setMembershipFee(Integer membershipFee) {
        this.membershipFee = membershipFee;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

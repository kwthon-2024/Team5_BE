package beanpowder.clubapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "new_clubs") // 테이블 이름과 매핑
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String category;
    private String field;
    private String room;
    private Integer membershipFee;
    private Boolean isOpen;
    private String purpose; // 가입 목적
    private String imageUrl; // 이미지 URL

    public Club() {}

    public Club(String name, String category, String field, String room, Integer membershipFee, Boolean isOpen, String purpose, String imageUrl) {
        this.name = name;
        this.category = category;
        this.field = field;
        this.room = room;
        this.membershipFee = membershipFee;
        this.isOpen = isOpen;
        this.purpose = purpose;
        this.imageUrl = imageUrl;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

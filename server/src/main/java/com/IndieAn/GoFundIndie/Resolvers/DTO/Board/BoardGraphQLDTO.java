package com.IndieAn.GoFundIndie.Resolvers.DTO.Board;

import com.IndieAn.GoFundIndie.Domain.Entity.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class BoardGraphQLDTO {
    private long id;
    private long userId;
    private boolean isApprove;
    private String title;
    private String producer;
    private String distributor;
    private String posterImg;
    private String viewLink;
    private String infoCountry;
    private String infoCreatedYear;
    private String infoCreatedDate;
    private int infoTime;
    private int infoLimit;
    private String infoStory;
    private boolean infoSubtitle;
    private String createdAt;

    public BoardGraphQLDTO() {}

    public static BoardGraphQLDTO from(Board board) {
        return BoardGraphQLDTO.builder()
                .id(board.getId())
                .userId(board.getUserId().getId())
                .isApprove(board.isApprove())
                .title(board.getTitle())
                .producer(board.getProducer())
                .distributor(board.getDistributor())
                .posterImg(board.getPosterImg())
                .viewLink(board.getViewLink())
                .infoCountry(board.getInfoCountry())
                .infoCreatedYear(board.getInfoCreatedYear())
                .infoTime(board.getInfoTime())
                .infoLimit(board.getInfoLimit())
                .infoStory(board.getInfoStory())
                .infoSubtitle(board.isInfoSubtitle())
                .createdAt(board.getCreatedAt().toString())
                .build();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public boolean isApprove() {
        return isApprove;
    }

    public void setApprove(boolean approve) {
        isApprove = approve;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getPosterImg() {
        return posterImg;
    }

    public void setPosterImg(String posterImg) {
        this.posterImg = posterImg;
    }

    public String getViewLink() {
        return viewLink;
    }

    public void setViewLink(String viewLink) {
        this.viewLink = viewLink;
    }

    public String getInfoCountry() {
        return infoCountry;
    }

    public void setInfoCountry(String infoCountry) {
        this.infoCountry = infoCountry;
    }

    public String getInfoCreatedYear() {
        return infoCreatedYear;
    }

    public void setInfoCreatedYear(String infoCreatedYear) {
        this.infoCreatedYear = infoCreatedYear;
    }

    public String getInfoCreatedDate() {
        return infoCreatedDate;
    }

    public void setInfoCreatedDate(String infoCreatedDate) {
        this.infoCreatedDate = infoCreatedDate;
    }

    public int getInfoTime() {
        return infoTime;
    }

    public void setInfoTime(int infoTime) {
        this.infoTime = infoTime;
    }

    public int getInfoLimit() {
        return infoLimit;
    }

    public void setInfoLimit(int infoLimit) {
        this.infoLimit = infoLimit;
    }

    public String getInfoStory() {
        return infoStory;
    }

    public void setInfoStory(String infoStory) {
        this.infoStory = infoStory;
    }

    public boolean isInfoSubtitle() {
        return infoSubtitle;
    }

    public void setInfoSubtitle(boolean infoSubtitle) {
        this.infoSubtitle = infoSubtitle;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}

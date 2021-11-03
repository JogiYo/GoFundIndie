package com.IndieAn.GoFundIndie.Resolvers.DTO.Board;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
public class CreateBoardCompleteDTO {
    @NotBlank
    private long boardId;

    @NotBlank
    private long userId;

    @NotBlank
    private String title;

    @NotBlank
    private String infoCountry;

    @NotBlank
    private String infoCreatedYear;

    @NotBlank
    private int infoTime;

    @NotBlank
    private String infoStory;

    private String producer;
    private String distributor;
    private String posterImg;
    private String viewLink;
    private int infoLimit;
    private boolean infoSubtitle;
    private String infoCreatedDate;

    public CreateBoardCompleteDTO() {}

    public CreateBoardCompleteDTO(long boardId, long userId, String title, String infoCountry, String infoCreatedYear, int infoTime, String infoStory, String producer, String distributor, String posterImg, String viewLink, int infoLimit, boolean infoSubtitle, String infoCreatedDate) {
        this.boardId = boardId;
        this.userId = userId;
        this.title = title;
        this.infoCountry = infoCountry;
        this.infoCreatedYear = infoCreatedYear;
        this.infoTime = infoTime;
        this.infoStory = infoStory;
        this.producer = producer;
        this.distributor = distributor;
        this.posterImg = posterImg;
        this.viewLink = viewLink;
        this.infoLimit = infoLimit;
        this.infoSubtitle = infoSubtitle;
        this.infoCreatedDate = infoCreatedDate;
    }
}

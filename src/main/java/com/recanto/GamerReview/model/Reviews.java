package com.recanto.GamerReview.model;

import lombok.Data;

@Data
public class Reviews {
    private int reviewID;
    private int gameID;
    private int userID;
    private int hoursPlayed;
    private double reviewGrade;
    private String reviewComment;
    private boolean reviewRecommend;
    private String reviewStatus;    
}

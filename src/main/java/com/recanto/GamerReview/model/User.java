package com.recanto.GamerReview.model;

import lombok.Data;

@Data
public class User {
    private int userID;
    private String userName;
    private String userDisplayName;
    private boolean superUser;
    private int userStatus;
}

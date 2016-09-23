package com.yyt.print.user.pojo;

import java.sql.Blob;
import java.util.Date;

/**
 * 买家认证
 * Created by SomeBody on 2016/9/23.
 */
public class UserBuyer {
    private int userId;
    private String cardNumber;
    private Blob cardFPhoto;
    private Blob cardBPhoto;
    private Blob userCardPhoto;
    private int status;
    private String msg;
    private Date createTime;
    private Date updateTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Blob getCardFPhoto() {
        return cardFPhoto;
    }

    public void setCardFPhoto(Blob cardFPhoto) {
        this.cardFPhoto = cardFPhoto;
    }

    public Blob getCardBPhoto() {
        return cardBPhoto;
    }

    public void setCardBPhoto(Blob cardBPhoto) {
        this.cardBPhoto = cardBPhoto;
    }

    public Blob getUserCardPhoto() {
        return userCardPhoto;
    }

    public void setUserCardPhoto(Blob userCardPhoto) {
        this.userCardPhoto = userCardPhoto;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

package com.justgraduationproject.android.recommendations;

import android.view.View;

/**
 * Created by Mahmoud Abaza on 4/3/2018.
 */

public class Socialization {

    //Attributes

    private int ProfilePic;
    private int Identity;
    private long Time;
    private int Content;
    private boolean Support;
    private View Comment , Share;

    //Constructors

    public Socialization()
    {}

    public Socialization(int profilePic, int identity, long time, int content, boolean support) {
        ProfilePic = profilePic;
        Identity = identity;
        Time = time;
        Content = content;
        Support = support;
    }

    public Socialization(int profilePic, int identity, long time, int content, boolean support, View comment, View share)
    {
        ProfilePic = profilePic;
        Identity = identity;
        Time = time;
        Content = content;
        Support = support;
        Comment = comment;
        Share = share;
    }

    //Behaviours

    public int getProfilePic() {
        return ProfilePic;
    }

    public void setProfilePic(int profilePic) {
        ProfilePic = profilePic;
    }

    public int getIdentity() {
        return Identity;
    }

    public void setIdentity(int identity) {
        Identity = identity;
    }

    public long getTime() {
        return Time;
    }

    public void setTime(long time) {
        Time = time;
    }

    public int getContent() {
        return Content;
    }

    public void setContent(int content) {
        Content = content;
    }

    public boolean isSupport() {
        return Support;
    }

    public void setSupport(boolean support) {
        Support = support;
    }

    public View getComment() {
        return Comment;
    }

    public void setComment(View comment) {
        Comment = comment;
    }

    public View getShare() {
        return Share;
    }

    public void setShare(View share) {
        Share = share;
    }
}

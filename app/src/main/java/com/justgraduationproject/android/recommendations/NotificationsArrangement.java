package com.justgraduationproject.android.recommendations;

/**
 * Created by Mahmoud Abaza on 4/3/2018.
 */

public class NotificationsArrangement {

    //Attributes
    private int ProfilePics;
    private int Content;
    private long Time;

    //Constructors
    public NotificationsArrangement()
    {}

    public NotificationsArrangement(int profilePics, int content, long time)
    {
        ProfilePics = profilePics;
        Content = content;
        Time = time;
    }

    //Behaviours
    public int getProfilePics() {
        return ProfilePics;
    }

    public void setProfilePics(int profilePics) {
        ProfilePics = profilePics;
    }

    public int getContent() {
        return Content;
    }

    public void setContent(int content) {
        Content = content;
    }

    public long getTime() {
        return Time;
    }

    public void setTime(long time) {
        Time = time;
    }
}

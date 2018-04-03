package com.justgraduationproject.android.recommendations;

/**
 * Created by Mahmoud Abaza on 4/3/2018.
 */

public class Arrangement
{
    //Attributes
    private int ProfilePic;
    private int Identity;
    private long Time;
    private int Content;

    //Constructors
    public Arrangement()
    {}

    public Arrangement(int profilePic, int identity, long time, int content)
    {
        ProfilePic = profilePic;
        Identity = identity;
        Time = time;
        Content = content;
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
}


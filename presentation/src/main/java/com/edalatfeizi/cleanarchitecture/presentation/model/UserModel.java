package com.edalatfeizi.cleanarchitecture.presentation.model;

public class UserModel
{
    private final int userId;

    public UserModel(int userId)
    {
        this.userId = userId;
    }

    private String coverUrl;
    private String email;
    private String fullName;
    private String description;
    private int followers;


    public int getUserId()
    {
        return userId;
    }

    public String getCoverUrl()
    {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl)
    {
        this.coverUrl = coverUrl;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getFollowers()
    {
        return followers;
    }

    public void setFollowers(int followers)
    {
        this.followers = followers;
    }
}

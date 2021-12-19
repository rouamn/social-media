package com.example.socialmedia.model;

public class Storymodel {
    int story , storytype, profile;
    String name;

    public Storymodel(int story, int storytype, int profile, String name) {
        this.story = story;
        this.storytype = storytype;
        this.profile = profile;
        this.name = name;
    }

    public int getStory() {
        return story;
    }

    public int getStorytype() {
        return storytype;
    }

    public int getProfile() {
        return profile;
    }

    public String getName() {
        return name;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public void setStorytype(int storytype) {
        this.storytype = storytype;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public void setName(String name) {
        this.name = name;
    }
}

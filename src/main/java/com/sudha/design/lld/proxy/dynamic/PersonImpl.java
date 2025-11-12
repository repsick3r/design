package com.sudha.design.lld.proxy.dynamic;

public class PersonImpl implements Person{
    private String name;
    private String gender;
    private String interests;
    int rating;
    int ratingCount;

    public PersonImpl(String name, String gender, String interests) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        rating = 0;
        ratingCount=0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getGeekRating() {
        return ratingCount == 0 ? 0 : (rating/ratingCount);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setGeekRating(int geekRating) {
        this.rating += geekRating;
        ratingCount += 1;
    }
}

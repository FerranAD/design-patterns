package proxy.protection;

public class PersonImpl implements Person {
    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int totalRatings = 0;


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
        if (totalRatings == 0) return 0;
        return rating/totalRatings;
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
    public void setGeekRating(int rating) {
        this.rating += rating;
        totalRatings++;
    }
}

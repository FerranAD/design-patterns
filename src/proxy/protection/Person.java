package proxy.protection;

public interface Person {
    String getName();
    String getGender();
    String getInterests();
    int getGeekRating();

    void setName(String name) throws Throwable;
    void setGender(String gender) throws Throwable;
    void setInterests(String interests) throws Throwable;
    void setGeekRating(int rating) throws Throwable;
}

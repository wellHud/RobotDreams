package homework22;

public class Translation {
    private String english;
    private String japanese;
    private String german;

    public Translation(String english, String japanese, String german) {
        this.english = english;
        this.japanese = japanese;
        this.german = german;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getJapanese() {
        return japanese;
    }

    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

    public String getGerman() {
        return german;
    }

    public void setGerman(String german) {
        this.german = german;
    }


}
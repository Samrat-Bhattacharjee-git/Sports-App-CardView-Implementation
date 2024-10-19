package com.example.cardview_sports_app;

public class model_class {
    int sports_image;
    String sports_title;

    public model_class(int sports_image, String sports_title) {
        this.sports_image = sports_image;
        this.sports_title = sports_title;
    }

    public int getSports_image() {
        return sports_image;
    }

    public void setSports_image(int sports_image) {
        this.sports_image = sports_image;
    }

    public String getSports_title() {
        return sports_title;
    }

    public void setSports_title(String sports_title) {
        this.sports_title = sports_title;
    }
}

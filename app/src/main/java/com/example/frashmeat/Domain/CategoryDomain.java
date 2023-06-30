package com.example.frashmeat.Domain;

public class CategoryDomain {
    private String Title;
    private String pic;

    public CategoryDomain(String title, String pic) {
        Title = title;
        this.pic = pic;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }



}

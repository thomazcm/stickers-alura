package br.com.alura.stickersimersao.content;

public class Content {
    private final String title;
    private final String imageUrl;

    public Content(String title, String imageUrl) {
        this.title = title.replaceAll(":", "");
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}

package actions;

public class Get {

    private String url;

    public Get(String url) {
        this.setUrl(url);
    }

    public String getUrl(String uri) {
        return this.url + uri;
    }

    public String getUrl(String uri, String uri2) {
        return this.url + uri + uri2;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

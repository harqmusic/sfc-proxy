package sfc.proxy.apisfc.dto;

public class DownloadUploadResponse {


    private String googleUrl;

    private String tsec;

    private String asoGDUrl;

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getGoogleUrl() {
        return googleUrl;
    }

    public void setGoogleUrl(String googleUrl) {
        this.googleUrl = googleUrl;
    }

    public String getTsec() {
        return tsec;
    }

    public void setTsec(String tsec) {
        this.tsec = tsec;
    }

    public String getAsoGDUrl() {
        return asoGDUrl;
    }

    public void setAsoGDUrl(String asoGDUrl) {
        this.asoGDUrl = asoGDUrl;
    }



}

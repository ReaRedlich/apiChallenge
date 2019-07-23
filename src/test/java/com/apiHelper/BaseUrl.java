package com.apiHelper;

public enum BaseUrl {
    REGISTER_BASE_URL("https://rest-eus1.ott.kaltura.com/restful_v5_0/api_v3/");

    private String baseUrl;

    BaseUrl(String baseUrl) { this.baseUrl = baseUrl; }

    public String getBaseUrl() {
        return baseUrl;
    }
}

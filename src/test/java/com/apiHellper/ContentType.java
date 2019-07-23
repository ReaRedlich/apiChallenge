package com.apiHellper;

public enum ContentType {
    JSON("application/json");

    private String contentType;

    ContentType(String contentType) { this.contentType = contentType; }

    public String getContentType() {
        return contentType;
    }
}

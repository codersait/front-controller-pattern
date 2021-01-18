package com.company;

public class Request {
    private String request;
    private Header header;

    public Request(String request, Header header) {
        this.request = request;
        this.header = header;
    }

    public String getRequest() {
        return request;
    }

    public Header getHeader() {
        return header;
    }
}

package com.vital.api.core;

public final class Environment {
    public static final Environment PRODUCTION = new Environment("https://api.tryvital.io");

    private final String url;

    private Environment(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public static Environment custom(String url) {
        return new Environment(url);
    }
}

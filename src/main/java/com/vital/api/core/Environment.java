package com.vital.api.core;

public final class Environment {
    public static final Environment PRODUCTION = new Environment("https://api.tryvital.io");

    public static final Environment PRODUCTION_EU = new Environment("https://api.eu.tryvital.io");

    public static final Environment SANDBOX = new Environment("https://api.sandbox.tryvital.io");

    public static final Environment SANDBOX_EU = new Environment("https://api.sandbox.eu.tryvital.io");

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

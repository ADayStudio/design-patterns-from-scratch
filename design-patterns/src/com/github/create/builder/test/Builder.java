package com.github.create.builder.test;

public abstract class Builder {

    public abstract Builder username(String username);

    public abstract Builder desc(String desc);

    public abstract User build();
}

package com.albion.config;

public interface PackageState {
    void start();
    void process();
    void complete();
    void printStatus();
}

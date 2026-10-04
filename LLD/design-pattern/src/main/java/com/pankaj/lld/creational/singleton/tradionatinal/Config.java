package com.pankaj.lld.creational.singleton.tradionatinal;

class Config {
    private static final Config INSTANCE = new Config();

    private Config(){}

    static Config getInstance() {
        return INSTANCE;
    }
}
package com.zyang;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.UUID;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class Server {
    final String uuid;
    private String name, ip;

    public Server(String name, String ip) {
        this.name = name;
        this.ip = ip;
        this.uuid = UUID.randomUUID().toString();
    }

    public Server() {
        this.uuid = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getIp() {
        return ip;
    }

}

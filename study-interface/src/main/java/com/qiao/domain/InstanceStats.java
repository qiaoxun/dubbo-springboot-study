package com.qiao.domain;

import java.io.Serializable;

public class InstanceStats implements Serializable {
    private int id;
    private String host;
    private String url;
    private String status;
    private String dbStatus;
    private String ip;

    public InstanceStats(int id, String host, String url, String status, String dbStatus, String ip) {
        this.id = id;
        this.host = host;
        this.url = url;
        this.status = status;
        this.dbStatus = dbStatus;
        this.ip = ip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDbStatus() {
        return dbStatus;
    }

    public void setDbStatus(String dbStatus) {
        this.dbStatus = dbStatus;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}

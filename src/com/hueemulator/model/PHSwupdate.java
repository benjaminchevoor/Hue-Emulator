package com.hueemulator.model;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class PHSwupdate {

    @JsonIgnore
    private Object checkforupdate;
    
    @JsonIgnore
    private Object devicetypes;

    @JsonProperty("notify")
    private Boolean notify;
    
    @JsonProperty(value = "text")
    private String text;

    @JsonProperty("updatestate")
    private Integer updatestate;

    @JsonProperty("url")
    private String url;

    public Object getCheckforupdate() {
        return checkforupdate;
    }

    public Object getDevicetypes() {
        return devicetypes;
    }

    public Boolean getNotify() {
        return notify;
    }

    public String getText() {
        return text;
    }

    public Integer getUpdatestate() {
        return updatestate;
    }

    public String getUrl() {
        return url;
    }

    public void setNotify(Boolean notify) {
        this.notify = notify;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUpdatestate(Integer updatestate) {
        this.updatestate = updatestate;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

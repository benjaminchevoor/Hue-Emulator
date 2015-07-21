package com.hueemulator.model;

import java.util.Map;
import org.codehaus.jackson.annotate.JsonIgnore;

import org.codehaus.jackson.annotate.JsonProperty;

public class PHConfig {
    
    @JsonIgnore
    private Object apiversion;

    @JsonProperty("dhcp")
    private Boolean dhcp;

    @JsonProperty("gateway")
    private String gateway;
    
    @JsonProperty(value = "ipaddress")
    private String ipaddress;
    
    @JsonProperty(value = "linkbutton")
    private Boolean linkbutton;
    
    @JsonIgnore
    private Object localtime;

    @JsonProperty("mac")
    private String mac;

    @JsonProperty("name")
    private String name;

    @JsonProperty("netmask")
    private String netmask;
    
    @JsonIgnore
    private Object portalconnection;

    @JsonProperty("portalservices")
    private Boolean portalservices;
    @JsonIgnore
    private Object portalstate;
    
    @JsonProperty(value = "proxyaddress")
    private String proxyaddress;

    @JsonProperty("proxyport")
    private Integer proxyport;

    @JsonProperty("swupdate")
    private PHSwupdate swupdate;

    @JsonProperty("swversion")
    private String swversion;
    
    @JsonIgnore
    private Object timezone;

    @JsonProperty("UTC")
    private String utc;

    @JsonProperty("whitelist")
    private Map<String, PHWhitelistEntry> whitelist;
    
    @JsonIgnore
    private Object zigbeechannel;    

    public Object getApiversion() {
        return apiversion;
    }

    public Boolean getDhcp() {
        return dhcp;
    }

    public String getGateway() {
        return gateway;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public Boolean getLinkbutton() {
        return linkbutton;
    }

    public Object getLocaltime() {
        return localtime;
    }

    public String getMac() {
        return mac;
    }

    public String getName() {
        return name;
    }

    public String getNetmask() {
        return netmask;
    }

    public Object getPortalconnection() {
        return portalconnection;
    }

    public Boolean getPortalservices() {
        return portalservices;
    }

    public Object getPortalstate() {
        return portalstate;
    }

    public String getProxyaddress() {
        return proxyaddress;
    }

    public Integer getProxyport() {
        return proxyport;
    }

    public PHSwupdate getSwupdate() {
        return swupdate;
    }

    public String getSwversion() {
        return swversion;
    }

    public Object getTimezone() {
        return timezone;
    }

    public String getUtc() {
        return utc;
    }

    public Map<String, PHWhitelistEntry> getWhitelist() {
        return whitelist;
    }

    public Object getZigbeechannel() {
        return zigbeechannel;
    }

    public void setDhcp(Boolean dhcp) {
        this.dhcp = dhcp;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public void setLinkbutton(Boolean linkbutton) {
        this.linkbutton = linkbutton;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public void setPortalservices(Boolean portalservices) {
        this.portalservices = portalservices;
    }

    public void setProxyaddress(String proxyaddress) {
        this.proxyaddress = proxyaddress;
    }

    public void setProxyport(Integer proxyport) {
        this.proxyport = proxyport;
    }

    public void setSwupdate(PHSwupdate swupdate) {
        this.swupdate = swupdate;
    }

    public void setSwversion(String swversion) {
        this.swversion = swversion;
    }

    public void setUtc(String utc) {
        this.utc = utc;
    }

    public void setWhitelist(Map<String, PHWhitelistEntry> whitelist) {
        this.whitelist = whitelist;
    }
}

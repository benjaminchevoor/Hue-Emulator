package com.hueemulator.model;

import java.util.Map;
import org.codehaus.jackson.annotate.JsonIgnore;

import org.codehaus.jackson.annotate.JsonProperty;

public class PHBridgeConfiguration {


    @JsonProperty("config")
    private PHConfig config;

    @JsonProperty("groups")
    private Map<String, PHGroupsEntry> groups;
    
    @JsonProperty(value = "lights")
    private Map<String, PHLight> lights;
    
    @JsonIgnore
    private Object rules;

    @JsonProperty("scenes")
    private Map<String, PHScenesEntry> scenes;
    
    @JsonProperty(value = "schedules")
    private Map<String, PHSchedulesEntry> schedules;
    
    @JsonIgnore
    private Object sensors;

    public PHConfig getConfig() {
        return config;
    }

    public Map<String, PHGroupsEntry> getGroups() {
        return groups;
    }

    public Map<String, PHLight> getLights() {
        return lights;
    }

    public Object getRules() {
        return rules;
    }

    public Map<String, PHScenesEntry> getScenes() {
        return scenes;
    }

    public Map<String, PHSchedulesEntry> getSchedules() {
        return schedules;
    }

    public Object getSensors() {
        return sensors;
    }

    public void setConfig(PHConfig config) {
        this.config = config;
    }

    public void setGroups(Map<String, PHGroupsEntry> groups) {
        this.groups = groups;
    }

    public void setLights(Map<String, PHLight> lights) {
        this.lights = lights;
    }

    public void setScenes(Map<String, PHScenesEntry> scenes) {
        this.scenes = scenes;
    }

    public void setSchedules(Map<String, PHSchedulesEntry> schedules) {
        this.schedules = schedules;
    }

}

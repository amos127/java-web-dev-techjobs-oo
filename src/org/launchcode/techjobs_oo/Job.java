package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String noData = "Data not available";
        if (this.name == null && this.employer == null && this.location == null && this.positionType == null && this.coreCompetency == null) {
            return "OOPS! This job does not seem to exist.";
        } else {
            return "\nID: " + this.getId()
                    + "\nName: " + (this.name == null || this.name.isEmpty() ? noData : this.getName())
                    + "\nEmployer: " + (this.employer == null || this.employer.getValue().isEmpty() ? noData : this.getEmployer())
                    + "\nLocation: " + (this.location == null || this.location.getValue().isEmpty() ? noData : this.getLocation())
                    + "\nPosition Type: " + (this.positionType == null || this.positionType.getValue().isEmpty() ? noData : this.getPositionType())
                    + "\nCore Competency: " + (this.coreCompetency == null || this.coreCompetency.getValue().isEmpty() ? noData : this.getCoreCompetency())
                    + "\n";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

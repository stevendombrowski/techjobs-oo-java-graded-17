package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.Float.isNaN;
import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job (){
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Job job = (Job) o;
//        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
//    }


//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

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

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
//            return System.lineSeparator();
//Need if statements to see if the constructor variables are empty might be able to use isEmpty
        //Each constructor is not labeled as String or int so, it must be turned into a String to validate correctly

        String employerTest = employer.toString();
        String locationTest = location.toString();
        String positionTest = positionType.toString();
        String coreTest = coreCompetency.toString();
        if(name.isEmpty()){name = "Data not available";}
        if(employer.toString().isEmpty()){employerTest = "Data not available";}
        if(location.toString().isEmpty()){locationTest = "Data not available";}
        if(positionType.toString().isEmpty()){positionTest = "Data not available";}
        if(coreCompetency.toString().isEmpty()){coreTest = "Data not available";}

        return  lineSeparator() +
                "ID: " + id +
                lineSeparator() +
                "Name: " + name +
                lineSeparator() +
                "Employer: " + employerTest +
                lineSeparator() +
                "Location: " + locationTest +
                lineSeparator() +
                "Position Type: " + positionTest +
                lineSeparator() +
                "Core Competency: " + coreTest +
                lineSeparator();



    }


}


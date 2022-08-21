package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name = null;
    private Employer employer = null;
    private Location location = null;
    private PositionType positionType = null;
    private CoreCompetency coreCompetency = null;

    private static final String DEFAULT_MESSAGE = "Data not available";

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public Job() {
        this.id = nextId;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {

        String toStringId; // = Integer.toString(this.id);
        if(Integer.toString(this.id).equals("") || Integer.toString(this.id)==null) {
            toStringId  = "Data no available";
        }else {
            toStringId = Integer.toString(this.id);
        }

        String toStringName;
        if(this.getName().equals("")||this.getName()==null){
            toStringName = "Data no available";
        }else{
            toStringName = this.getName();
        }

        String toStringEmployer;
        if(this.getEmployer().toString().equals("") || this.getEmployer()==null) {
            toStringEmployer = "Data no available";
        }else{
            toStringEmployer = this.getEmployer().toString();
        }

        String toStringLocation;
        if(this.getLocation().toString().equals("") || this.getLocation()==null) {
            toStringLocation = "Data no available";
        }else{
            toStringLocation = this.getLocation().toString();
        }

        String toStringPositionType;
        if(this.getPositionType().toString().equals("") || this.getPositionType()==null) {
            toStringPositionType = "Data no available";
        }else{
            toStringPositionType = this.getPositionType().toString();
        }

        String toStringCoreCompetency;
        if(this.getCoreCompetency().toString().equals("") || this.getCoreCompetency()==(null)) {
            toStringCoreCompetency = "Data no available";
        }else{
            toStringCoreCompetency = this.getCoreCompetency().toString();
        }





        return String.format("\nID: %s\nName: %s\nEmployer: %s\nLocation: %s\nPosition Type: %s\nCore Competency: %s",
            toStringId, toStringName, toStringEmployer, toStringLocation, toStringPositionType, toStringCoreCompetency);


//        return String.format("\nID: %s\nName: %s\nEmployer: %s\nLocation: %s\nPosition Type: %s\nCore Competency: %s",
//                String.valueOf(this.id) == null ? DEFAULT_MESSAGE : this.id,
//                this.getName() == null ? DEFAULT_MESSAGE : this.getName(),
//                this.getEmployer().toString() == null ? DEFAULT_MESSAGE : this.getEmployer(),
//                this.getLocation().toString() == null ? DEFAULT_MESSAGE : this.getLocation(),
//                this.getPositionType().toString() == null ? DEFAULT_MESSAGE : this.getPositionType(),
//                this.getCoreCompetency().toString() == null ? DEFAULT_MESSAGE : this.getCoreCompetency());


       // Integer idData = this.getId();
       // String idString = String.format("%s", idData);

//        String jobToString = String.format ("\nID: %s" + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: " + this.getCoreCompetency(), idData);
//          if(idData.equals(" ") {
//
       // }

        //        String nameData = this.getName();
//        String nameToSting = String.format ("Name: %n", nameData);



       // System.out.println(idToString + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: " + this.getCoreCompetency());
//        System.out.println("Name: " + this.getName());
//        System.out.println("Employer: " + this.getEmployer());
//        System.out.println("Location: " + this.getLocation());
//        System.out.println("Position Type: " + this.getPositionType());
//        System.out.println("Core Competency: " + this.getCoreCompetency());
//




//        String output = "";
//        return output;
        //return jobToString;
    }
}

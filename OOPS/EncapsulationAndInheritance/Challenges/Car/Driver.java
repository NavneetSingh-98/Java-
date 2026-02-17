package OOPS.EncapsulationAndInheritance.Challenges.Car;

public class Driver {
    private String name;
    private String age;
    private String noOfBone;
    private String bloodGroup;

       //Constructor
    public Driver(String name, String age, String noOfBone, String bloodGroup) {
        this.name = name;
        this.age = age;
        this.noOfBone = noOfBone;
        this.bloodGroup = bloodGroup;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getNoOfBone() {
        return noOfBone;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    @Override
    public String toString() {
        return "Driver [name=" + name + ", age=" + age + ", noOfBone=" + noOfBone + ", bloodGroup=" + bloodGroup + "]";
    }

    

 
    
    
}

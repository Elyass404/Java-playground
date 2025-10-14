class Encapsulation {
    //the concept of encapsulation is the visibility/accessibility of attributes in other classes, and it is keeping them accessible only inside their classe
    //and we achieve that by setting the attributes into private , and access them with getters and set them with setters

    //now these attributes can not be accessed outside of this class
    private String firstName ;
    private String lastName;


    //now if we want to get the values of the attributes, we use the getters, instead of usign the "obj.attributeName" way
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    //if we want to change /set the value of the attributes we call the setters methods, and passing the value we want to pass;
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public static void main(String[] args){
        //NOTE: supose we created this object in another class, not here in the same class
        Encapsulation obj = new Encapsulation();

        //setting the first and last name
        obj.setFirstName("elyass");
        obj.setLastName("developer");

        //now getting them and store them in variables 
        String fName = obj.getFirstName();
        String lName = obj.getLastName();

        //NOTE: we can not do the following code, it will cause an error (when we try to get it out of this class which is his class)
        //String firstname = obj.firstName;
        //System.out.println(obj.firstName);

        //now we we can print them
        System.out.println(fName + " " + lName);
    }


}
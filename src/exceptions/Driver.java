package exceptions;

public class Driver {
  private String name;
   private int age;
   private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        name = name.trim();
        if(name.contains(" ")){
            throw new Exception(name + " invalid name");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}


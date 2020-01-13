package accessModifiers;

public class Person {
    private String name;
   private String gender;
   private int age;
   private double height;
   private double weight;

   public String getName(){
      return name;
   }
   public void setGender(String gender) {
      if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
         this.gender = gender;
      } else {
         System.out.println("Invalid gender");
      }
   }
   public int getAge(){
      return age;
   }
   public void setName(String name){
      this.name = name;
   }
   public void setAge(int age) {
      if (age >= 0 && age <= 120) {
         this.age = age;
      } else {
         System.out.println("invalid age");
      }
   }
   public double getheight(){
      return height;
   }
   public void setHeight(double height) {
      if (height > 0) {
         this.height = height;
      } else {
         System.out.println("invalid height");
      }
   }
   public double getWeight(){
      return weight;
   }
   public void setWeight(double weight){
   if(weight>0){
         this.weight = weight;
         } else {
         System.out.println("Invalid weight");
      }
   }
   public void info(){
      System.out.println("Name: " + this.name);
      System.out.println("Age: " + this.age);
      System.out.println("Gender: " + this.gender);
      System.out.println("Height: "  + this.height);
      System.out.println("Weight: "+ this.weight);
   }


}

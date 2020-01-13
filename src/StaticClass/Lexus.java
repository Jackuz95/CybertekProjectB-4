package StaticClass;

public class Lexus {
    String model;
    int year;
    String color;
    double mileage;
    boolean oldOrNew;
    double price;
    static int totalLexus;


     public Lexus(String model, int year){
         this.model = model;
         this.year = year;
         totalLexus++;
     }

      public static double mileToKm(double miles){
         double km;
         km = miles*1.6;
         return km;
      }

        public static void evaluateCar(Lexus car){
         int age =2019 - car.year;
         if(car.mileage<50000 && age<3){
                System.out.println("Best choice");
            }else if((car.mileage>=50000 && car.mileage<=100000) && (age>=3 && age<=7)){
             System.out.println("fair choice");
         } else if(car.mileage>100000 && car.mileage<200000){
             System.out.println("you decide");
         } else if(car.mileage>=200000){
             System.out.println("Stay away");
         } else {
             System.out.println("Not able to evaluate");
         }

        }
}

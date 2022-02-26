package code.animals;

 public class Animal {
   private  String food;
    private String location;

     public String getFood() {
         return food;
     }

     public void setFood(String food) {
         this.food = food;
     }

     public String getLocation() {
         return location;
     }

     public void setLocation(String location) {
         this.location = location;
     }

     public void makeNoise(){
         System.out.println("Animal make noise");
     }

     public void eat(){
         System.out.println("Animal eat");
     }

     public void sleep(){
         System.out.println("Animal sleep");
     }

 }

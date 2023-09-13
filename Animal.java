package Homework;

public class Animal {
   public String[] name;
   public boolean haveAsPet;
   public int quantity;
   public String sound;


   public void printAnimalName() {
      System.out.println("===========");
      for (int i = 0; i < name.length; i++) {
         System.out.println(name[i]);
      }

   }

   public void printAnimalSound() {

      System.out.println(sound);
   }

}


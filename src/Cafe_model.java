
import java.util.List;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baou usman
 */
public class Cafe_model {
   public List <String> Food_Items;
   public List <Integer> Item_Prizes;
   private int[] cook;
   //Constructor
   Cafe_model(){
   Food_Items=new ArrayList <String>();
   Item_Prizes=new ArrayList <Integer>();
   cook=new int[4];
   }
   //Set Food items in menu
   public void SetFoodItems(List <String>itemsL){
   for(int i=0;i<itemsL.size();i++){
   Food_Items.add(itemsL.get(i));
   }
   }
   //Set Prizes for food items
      public void SetFoodPrizes(List <Integer>itemsP){
   for(int i=0;i<itemsP.size();i++){
   Item_Prizes.add(itemsP.get(i));
   }
   }
    //Set Cook state
      public void SetCookState(int index){
      cook[index]=1;
      }
         //Get Food items in menu
   public <String> List GetFoodItems(){
      return Food_Items;
   }
   //Get Prizes for food items
      public <Integer> List getFoodPrizes(){
      return Item_Prizes;
   }
      //Get CookState
      public int GetCookState(int index){
      return cook[index];
      }
}

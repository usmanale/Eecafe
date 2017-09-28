
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Cafe_view {
 
    //Show food items and their prizes in front of them
    public void Show_items(List <String> fitems,List <Integer> fprizes){
      for(int i=0;i<fitems.size();i++){
          if(i==0){
          System.out.println("***********Appetizers***********");
          }else if(i==4){
          System.out.println("***********Soups***********");
          }else if(i==6){
          System.out.println("***********Main Course Dishes***********");
          }else if(i==12){
          System.out.println("***********Main Course Dishes***********");
          }
      System.out.print(i+1+")"+fitems.get(i)+"\t \t \t");
      System.out.println(fprizes.get(i));
      }
    }
}

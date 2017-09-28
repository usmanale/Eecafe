
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baou usman
 */
public class Cafe {
    //Main function to demonstrate cafe model,view and controller
    public static void main(String [] args){
    Scanner read= new Scanner(System.in);
    List <String> food_items;
    List <Integer> food_prizes;
    food_items=new ArrayList <String>();
    food_prizes=new ArrayList <Integer>();
    //adding food items
    food_items.add("Buffalo Chicken Dip"); food_items.add("Pepper Poppers"); food_items.add("Homemade Guacamole"); food_items.add("Avocado Salsa"); food_items.add("Chestnut bisque");
    food_items.add("Chicken noodle soup"); food_items.add("Beef Enchiladas"); food_items.add("Thai Beef."); food_items.add("World's Best Lasagna"); food_items.add("Mamaw's Chicken and Rice Casserole");
    food_items.add("Easy Meatloaf"); food_items.add("Curried Chicken"); food_items.add("Potato, Squas"); food_items.add("Garlicky Roasted Broccol"); food_items.add("Goat Cheese Gratin");
    //adding food prizes    
    food_prizes.add(40); food_prizes.add(40); food_prizes.add(40); food_prizes.add(40); food_prizes.add(100);
    food_prizes.add(100); food_prizes.add(400); food_prizes.add(400); food_prizes.add(400); food_prizes.add(400);
    food_prizes.add(400); food_prizes.add(400); food_prizes.add(300); food_prizes.add(300); food_prizes.add(300);
    
        Cafe_model model= new Cafe_model ();
        Cafe_view view= new Cafe_view ();
        Cafe_controller c=new Cafe_controller(model,view);
        c.setfooditems(food_items);
        c.setfoodprizes(food_prizes);
        c.showitems();
    int check1=1; //check for more items in one order
    int ocheck=1; //check for more than one order
    do{
        if(c.Order_time()){
    do{  
        int Prize_index;
        System.out.println("Enter item number you want to order(Press '0' to Exit)");
        Prize_index=read.nextInt();
        if(Prize_index==0){
        check1=Prize_index;
        }else{
        c.Calculate_Bill_count(Prize_index-1);
        if(Prize_index>0 && Prize_index<5){
            c.settime(1);
        }else if(Prize_index>4 && Prize_index<7){
            c.settime(2);
        }if(Prize_index>6 && Prize_index<13){
            c.settime(3);
        }if(Prize_index>12 && Prize_index<16){
            c.settime(4);
        }
        }
    }while(check1!=0);
        System.out.println("Your Bill="+c.getbillcount());
        System.out.println("Total Time="+c.gettime()+" Min");
        System.out.println("If there is no other order(press 2)");
        ocheck=read.nextInt();
        }else{
            System.out.println("We are Closed!");}
    
        }while(ocheck!=2);
     System.out.println("Thank you for using this service!");
    }
    
           }
    
    


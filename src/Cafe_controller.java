
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baou usman
 */
public class Cafe_controller {
    private Cafe_model model;
    private Cafe_view view;
   public int  bill_count;
   private int time;
    //constructor
    public Cafe_controller(Cafe_model m,Cafe_view c){
    model=m;
    view=c;
    bill_count=0;
    time=0;
    }
    //set food items
    public void setfooditems(List <String> lii){
    model.Food_Items=lii;
    }
    //set food prizes
    public void setfoodprizes(List <Integer> lip){
    model.Item_Prizes=lip;
    } 
    //set bill count
    public void setbillcount(int b){
    bill_count=b;
    }
    //Set CookState
    public void setcookstate(int index){
    model.SetCookState(index);
    }
        //set time
    public void settime(int ind){
    if(ind==1){
    time+=15;
    }else if(ind==2){
    time+=20;
    }else if(ind==3){
    time+=30;
    }else if(ind==4){
    time+=40;
    }
    }
    
    //get food items 
    public <String> List getfooditems(){
    return model.Food_Items;
    }
    //get food prizes 
    public <Integer> List getfoodprizes(){
    return model.Item_Prizes;
    }
    //get bill count 
    public int getbillcount(){
    return bill_count;
    }
    //get cookState
    public int getcookstate(int index){
    return model.GetCookState(index);
    }
    //get bill count 
    public int gettime(){
    return time;
    }
    //show food items and prizes
    public void showitems(){
    view.Show_items(model.GetFoodItems(), model.getFoodPrizes());
    }
    //Function to count the bill
    public int Calculate_Bill_count(int prize_index){
    bill_count+=(int) getfoodprizes().get(prize_index);
    return bill_count;
    }
    //Function to check available timings for order
    public boolean Order_time(){
    int t;
    Date date= new Date();
    Calendar Cal= GregorianCalendar.getInstance();
    t=Cal.get(Calendar.HOUR_OF_DAY);
    if(t>22 || t<11){
    return false;
    }
    else{
    return true;
    }
    }
}

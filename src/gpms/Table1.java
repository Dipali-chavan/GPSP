
package gpms;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenevo
 */
public class Table1 {
     private int no;
    private String description;
    private int purchasedate;
    private int noofthings;
    private int cost;
    private int completiondate;
    private int remainingamount;
    
    
    
    public Table1(int No,String Description,int Purchase_Date,int No_of_Things, int Cost ,int Completion_Date, int Remaining_amount )
    {
       
        this.no = No;
        this.description = Description;
        this.purchasedate = Purchase_Date;
        this.noofthings = No_of_Things;
        this.cost = Cost;
        this.completiondate = Completion_Date;
        this.remainingamount = Remaining_amount;
     
       

     }
 public int getNo()
    {
        return no;
    }
 
public String getDescription()
    {
        return description;
    }

public int getPurchase_Date()
    {
        return purchasedate;
    }
public int getNo_of_Things()
    {
        return noofthings;
    }
public int getCost()
    {
        return cost;
    }
public int getCompletion_Date()
    {
        return completiondate;
    }
public int getRemaining_amount()
    {
        return remainingamount;
    }


}

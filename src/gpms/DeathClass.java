
package gpms;
import java.sql.Time;
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
public class DeathClass {
    private String name;
    private Date dob;
    private String placeofdeath;
    private String permanantadd;
    private int regno;
    private Date regdate;
    private String mothername;
    private String fathername;
    
    
    
    public DeathClass(String Fullname,Date Dateofdeath,String PlaceofDeath,String PermanantAdd,int Regno,Date RegDate,String MotherName,String FatherName)
    {
       
        this.name = Fullname;
        this.dob = Dateofdeath;
        this.placeofdeath = PlaceofDeath;
        this.permanantadd = PermanantAdd;
        this.regno = Regno;
        this.regdate = RegDate;
        this.mothername = MotherName;
         this.fathername = FatherName;
       

     }
 public String getFullname()
    {
        return name;
    }
 
public Date getDateofdeath()
    {
        return dob;
    }

public String getPlaceofDeath()
    {
        return placeofdeath;
    }
public String getPermanantAdd()
    {
        return permanantadd;
    }
public int getRegno()
    {
        return regno;
    }
public Date getRegDate()
    {
        return regdate;
    }
public String getMotherName()
    {
        return mothername;
    }
public String getFatherName()
    {
        return fathername;
    }




    
}

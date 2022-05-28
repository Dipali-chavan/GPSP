
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
public class BirthClass {
     private String fname;
    private String lname;
    private Date dob;
    private Time tob;
     private String pob;
    private String city;
    private String taluka;
    private String district;
    private String gender;
    private int regno;
    private Date regdate;
    private String mothername;
    private String fathername;

public BirthClass(String Fname,String Lname,Date DOB,Time Birth_time,String Birth_place,String City,String Taluka,String District,String Gender,int Regno,Date RegDate,String Mother_name,String Father_name)
    {
        this.fname = Fname;
        this.lname = Lname;
        this.dob = DOB;
        this.tob = Birth_time;
         this.pob = Birth_place;
        this.city = City;
        this.taluka = Taluka;
        this.district = District;
        this.gender = Gender;
        this.regno = Regno;
        this.regdate = RegDate;
        this.mothername = Mother_name;
         this.fathername = Father_name;
       

     }
 public String getFname()
    {
        return fname;
    }
 public String getLname()
    {
        return lname;
    }
public Date getDOB()
    {
        return dob;
    }
public Time getBirth_time()
    {
        return tob;
    }
public String getBrith_place()
    {
        return pob;
    }
public String getCity()
    {
        return city;
    }
public String getTaluka()
    {
        return taluka;
    }
public String getDistrict()
    {
        return district;
    }
public String getGender()
    {
        return gender;
    }
public int getRegno()
    {
        return regno;
    }
public Date getRegDate()
    {
        return regdate;
    }
public String getMother_name()
    {
        return mothername;
    }
public String getFather_name()
    {
        return fathername;
    }



}

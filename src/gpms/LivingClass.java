
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
public class LivingClass {
   
    private String fullname;
    private String address;
    private Date regdate;
    private int regno;
    private String taluka;
   public LivingClass(String FullName,String Address ,Date RegDate,int RegNo,String Taluka)
    {
        this.fullname = FullName;
        this.address = Address;
        this.regdate = RegDate;
        this.regno = RegNo;
        this.taluka=Taluka;
    }

  public String getFullName()
    {
        return fullname;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public Date getRegDate()
    {
        return regdate;
    }
    
    public int getRegNo()
    {
        return regno;
    }
    public String getTaluka()
    {
        return taluka;
    }
}

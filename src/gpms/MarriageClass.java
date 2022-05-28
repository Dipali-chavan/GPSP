
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
public class MarriageClass {
    private String husbandname;
    private String wifename;
    private String placeofmarriage;
    private Date marriagedate;
    private Date regdate;
    private int regno;
   public MarriageClass(String Husband_Name,String Wife_Name ,String Place_of_Marriage,Date Marriage_Date,Date Regdate,int RegNo)
    {
        this.husbandname = Husband_Name;
        this.wifename = Wife_Name;
        this.placeofmarriage = Place_of_Marriage;
        this.marriagedate = Marriage_Date;
        this.regdate=Regdate;
        this.regno=RegNo;
        
        
    }

  public String getHusband_Name()
    {
        return husbandname;
    }
    
    public String getWife_Name()
    {
        return wifename;
    }
    
    public String getPlace_of_Marriage()
    {
        return placeofmarriage;
    }
    
    public Date getMarriage_Date()
    {
        return marriagedate;
    }
    public Date getRegdate()
    {
        return regdate;
    }
    public int getRegNo()
    {
        return regno;
    }
    
    
}

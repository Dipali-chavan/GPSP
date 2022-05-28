
package gpms;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenevo
 */
public class User {
    private int regno;
    private String husbandname;
    private String wifename;
    private String placeofmarriage;
    private String dateofmarriage;
    private String regdate;
   public User(int regno,String husbandname,String wifename,String placeofmarriage,String dateofmarriage,String regdate){
    this.regno=regno;
    this.husbandname=husbandname;
        this.wifename=wifename;
            this.placeofmarriage=placeofmarriage;
                this.dateofmarriage=dateofmarriage;
                    this.regdate=regdate;
    
    
           }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public int getregno()
   {
       return regno;
   }
   public String gethusbandname()
   {
       return husbandname;
   }
   public String getwifename()
   {
       return wifename;
   }
   public String getplaceofmarriage()
   {
       return placeofmarriage;
   }
   public String getdateofmarriage()
   {
       return dateofmarriage;
   }
   public String getregdate()
   {
       return regdate;
   }

    Object getFname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getLname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

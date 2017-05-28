/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Crash
 */
public class Logon {
    private String name;
    private String userName;
    private String password;
    private String address;
    private int contact;
    
    public Logon(String Name,String UserName, String Password, String Address, int Contact){
        this.name = Name;
        this.userName = UserName;
        this.password = Password;
        this.address = Address;
        this.contact = Contact;
    }
    
        public String getName(){
            return name;
            
        }
        public String getUserName(){
            return userName;
            
        }
        public String getPassword(){
            return password;
        }
        public String getAddress(){
            return address;
        }
        public int getContact(){
            return contact;
        }
        
        
    
}

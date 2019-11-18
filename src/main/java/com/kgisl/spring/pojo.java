package com.kgisl.spring;

/**
 * pojo
 */
public class pojo {
String username;
String password;
String email;
int phonenumber;
String city;
String gender;
/**
 * @return the password
 */
public String getPassword() {
    return password;
}
/**
 * @param usename the usename to set
 */
public void setUsename(String username) {
    this.username = username;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
    this.password = password;
}
/**
 * @return the usename
 */
public String getUsername() {
    return username;
}
/**
 * @return the email
 */
public String getEmail() {
    return email;
}
/**
 * @return the phonenumber
 */
public int getPhonenumber() {
    return phonenumber;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
    this.email = email;
}
/**
 * @param phonenumber the phonenumber to set
 */
public void setPhonenumber(int phonenumber) {
    this.phonenumber = phonenumber;
}
/**
 * @return the city
 */
public String getCity() {
    return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
    this.city = city;
}
/**
 * @return the gender
 */
public String getGender() {
    return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
    this.gender = gender;
}


public pojo(String username,String email, String password,int phonenumber,String city,String gender) {
    this.username = username;
    this.email=email;
    this.password = password;
    this.phonenumber=phonenumber;
    this.city=city;
    this.gender=gender;
    
    }
    public pojo(String email, String password,int phonenumber,String city,String gender) {
       
        this.email=email;
        this.password = password;
        this.phonenumber=phonenumber;
        this.city=city;
        this.gender=gender;
        
        }
   public pojo(){
       
   }
    public String toString() { 
        return String.format(username+" "+email+" "+ password+" "+phonenumber+" "+city+" "+gender); 
    } 
}
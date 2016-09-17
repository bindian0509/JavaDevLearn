/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author bharat
 */
public class User {

     private String username = null;
     private String password = null;
     private String firstname = null;
     private String lastname = null;
     private String email = null;

     public User(String username, String password, String firstname, String lastname,
                        String email) {
          this.username = username;
          this.password = password;
          this.firstname = firstname;
          this.lastname = lastname;
          this.email = email;
     }

     // Define all setter and getter methods for each member field.
     public String getUsername() {
          return username;
     }

     public void setUsername(String username) {
          this.username = username;
     }

     public String getPassword() {
          return password;
     }

     public void setPassword(String password) {
          this.password = password;
     }

     public String getFirstname() {
          return firstname;
     }

     public void setFirstname(String firstname) {
          this.firstname = firstname;
     }

     public String getLastname() {
          return lastname;
     }

     public void setLastname(String lastname) {
          this.lastname = lastname;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     @Override
     public String toString() {
          return "<" + username + ", " + password + ", " + email + ", "
                        + firstname + ", " + lastname + ">";
     }
}
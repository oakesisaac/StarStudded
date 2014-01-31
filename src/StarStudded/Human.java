
package StarStudded;


public class Human {
    
    private String firstName;
    private String lastName;
    private String homeTown;
    private char gender;
    private int age;
    
    public Human (String fn, String ln, String ht, char g, int a) {
        firstName = fn;
        lastName = ln;
        homeTown = ht;
        gender = g;
        age = a;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getHomeTown() {
        return homeTown;
    }
    
    public char getGender() {
        return gender;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setFirstName(String fn) {
        firstName = fn;
    }
    
    public void setLastName(String ln) {
        lastName = ln;
    }
    
    public void setHomeTown(String ht) {
        homeTown = ht;
    }
    
    public void setGender(char g) {
        gender = g;
    }
    
    public void setAge(int a) {
        age = a;
    }
    
    
    
}

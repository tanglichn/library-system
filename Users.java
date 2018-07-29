/**
 * The Users class contains methods to record,return and change users' detail information. 
 *
 * @author Li Tang
 * @version 2017.10.30
 */
public class Users
{
    // users' information 
    private String username;
    private String firstname;
    private String surname;
    private int housenumber;
    private String streetname;
    private int postcode;
    private String emailaddress;
    private String dateofbirth;
    

    /**
     * Create a user.
     */
    public Users(String username,String firstname,String surname,int housenumber,String streetname,int postcode,String emailaddress,String dateofbirth)
    {
        this.username = username;
        this.firstname = firstname;
        this.surname = surname;
        this.housenumber = housenumber;
        this.streetname = streetname;
        this.postcode = postcode;
        this.emailaddress = emailaddress;
        this.dateofbirth = dateofbirth;
    }

    /**
     * return users' username.
     *
     * @return    the String type of username.
     */
    public String returnUsername()
    {
        return username;
    }
    
    /**
     * return users' firstname.
     *
     * @return    the String type of firstname.
     */
    public String returnFirstname()
    {
        return firstname;
    }
    
    /**
     * return users' surname.
     *
     * @return    the String type of surname.
     */
    public String returnSurname()
    {
        return surname;
    }
    
    /**
     * return users' housenumber.
     *
     * @return    the int type of housenumber.
     */
    public int returnHousenumber()
    {
        return housenumber;
    }
    
    /**
     * return users' streetname.
     *
     * @return    the String type of streetname.
     */
    public String returnStreetname()
    {
        return streetname;
    }
    
    /**
     * return users' postcode.
     *
     * @return    the int type of postcode.
     */
    public int returnPostcode()
    {
        return postcode;
    }
    
    /**
     * return users' emailaddress.
     *
     * @return    the String type of emailaddress.
     */
    public String returnEmailaddress()
    {
        return emailaddress;
    }
    
    /**
     * return users' dateofbirth.
     *
     * @return    the String type of dateofbirth.
     */
    public String returnDateofbirth()
    {
        return dateofbirth;
    }
    
    /**
     * change users' username.
     *
     * @param  username  use username to replace.
     */
    public void changeUername(String username)
    {
        this.username = username;
    }
    
    /**
     * change users' firstname.
     *
     * @param  firstname  use firstname to replace.
     */
    public void changeFirstname(String firstname)
    {
        this.firstname = firstname;
    }
    
    /**
     * change users' surname.
     *
     * @param  surname  use surname to replace.
     */
    public void changeSurname(String surname)
    {
        this.surname = surname;
    }
    
    /**
     * change users' housenumber.
     *
     * @param  housenumber  use housenumber to replace.
     */
    public void changeHousenumber(int housrnumer)
    {
        this.housenumber = housenumber;
    }
    
    /**
     * change users' streetname.
     *
     * @param  streetname  use streetname to replace.
     */
    public void changeStreetname(String streetname)
    {
        this.streetname = streetname;
    }
    
    /**
     * change users' postcode.
     *
     * @param  postcode  use postcode to replace.
     */
    public void changePostcode(int postcode)
    {
        this.postcode = postcode;
    }
    
    /**
     * change users' emailaddress.
     *
     * @param  emailaddress  use emailaddress to replace.
     */
    public void changeEmailaddress(String emailaddress)
    {
        this.emailaddress = emailaddress;
    }
    
    /**
     * change users' dateofbirth.
     *
     * @param  dateofbirth  use dateofbirth to replace.
     */
    public void changeDateofbirth(String dateofbirth)
    {
        this.dateofbirth = dateofbirth;
    }
    
   
}

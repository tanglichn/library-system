import java.util.ArrayList;
import java.sql.*;
/**
 * The UserList class contains method to sotre uers in collection and database.It aols have methods to remove users, count number of users and return users' detail.
 *
 * @author Li Tang
 * @version 2017.11.02
 */
public class UserList
{
    // An ArrayList for storing the users.
    private ArrayList<Users> userlist;

    /**
     * Create a uselist.
     */
    public UserList()
    {
        userlist = new ArrayList<>();
    }

    /**
     * Add users to the collection and users will also be saved in database by using GetConnection class.
     *
     * @param  users  The user to be added.
     */
    public void addUsers(Users users)
    {
        userlist.add(users);
        
        //Add users into database by using Getconnetion.
        try
        {
            Connection con = GetConnection.getConnection();
            
            PreparedStatement ps = con.prepareStatement("INSERT INTO UserList VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1,users.returnUsername());
            ps.setString(2,users.returnFirstname());
            ps.setString(3,users.returnSurname());
            ps.setInt(4,users.returnHousenumber());
            ps.setString(5,users.returnStreetname());
            ps.setInt(6,users.returnPostcode());
            ps.setString(7,users.returnEmailaddress());
            ps.setString(8,users.returnDateofbirth());
            
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.err.println ("Exception: " + e.getMessage());
        }
       
        finally 
        {
            GetConnection.closeDB();
        }
    }
    
    /**
     * A method to remove a user from the collection by giving the user’s firstname and inform program users if there are two or more users with same firstname.
     *
     * @param  firstname  search the firstname to match.
     */
    public void removeUsers(String firstname)
    {
        ArrayList<Users>returnlist = new ArrayList<>();
        int index = 0;
        //search firstname and add into returnlist. 
        for (index=0;index<userlist.size();index++){
            if(userlist.get(index).returnFirstname().equals(firstname)){
                returnlist.add(userlist.get(index));
            }
        }
        //inform if there are two or more users with same firstname.
        if (index>=2){
         System.out.println("there are" +index+ "users with same firstname");
        }
        //remove the users.
        for(int i=0;i<index;i++){
            userlist.remove(returnlist.get(i));
        }
    }
    
    /**
     * A method to count the number of users in the system.
     *
     * @return  return number of users.
     */
    public int countNumberofusers()
    {
        return userlist.size();
    }
    
    /**
     * A method to return a user’s detail by the username.
     *
     * @param  username  search usrname to match. 
     */
    public void getUsersdetail(String username)
    {
        int index = 0;
        boolean found = false;
        while(index<userlist.size()&&!found){
            if(userlist.get(index).returnUsername().equals(username)){
                System.out.println(username);
                System.out.println(userlist.get(index).returnFirstname());
                System.out.println(userlist.get(index).returnSurname());
                System.out.println(userlist.get(index).returnHousenumber());
                System.out.println(userlist.get(index).returnStreetname());
                System.out.println(userlist.get(index).returnPostcode());
                System.out.println(userlist.get(index).returnEmailaddress());
                System.out.println(userlist.get(index).returnDateofbirth());
                found = true;
            }
            else{
                index++;
            }
        }
    }
}

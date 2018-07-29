import java.sql.*;
/**
 * The GetConnection calss contains constractor and method to save booklist and userlist into database.
 * 
 * @author Li Tang
 * @version 2017.11.22
 */
public class GetConnection
{
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";    
    //jdbc:mysql://database IP:port/database name
    private static String DB_URL = "jdbc:mysql://mysql.dur.ac.uk/Xljmv81_";
    private static String USER = "ljmv81";
    private static String PASS = "cheste2r";
    private static Connection con; 

    static
    {
        try 
        {
            //DB registration
            Class.forName(JDBC_DRIVER);
        }
        catch(ClassNotFoundException e)
        {
            System.err.println ("Exception: " + e.getMessage());
        }
    }
    
    /**
     * Connect to MySQL Database. 
     */
    public static Connection getConnection()
    {
        try
        {
            //DB connection
            con = DriverManager.getConnection (DB_URL,USER,PASS);
        }
        catch (SQLException se) 
        {
            //handle errors of JDBC
            //se.printStackTrace();   
            System.err.println ("SQLException: " + se.getMessage()); 
        }
        return con;
    }
    
    /**
     * Modify information of books or users on the database.
     * 
     * @param sql statement such as "UPDATE bookList SET ID=783950 WHERE ID=1" or "UPDATE userList SET Username='Mike' WHERE Username='M'"
     */
    public static void update(String sql)
    {
       try
       {
           Connection con = GetConnection.getConnection();
           PreparedStatement ps = con.prepareStatement(sql);
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
     * Close Datebase.
     * closeDB can also be called by methods in other classes.
     */
    public static void closeDB()
    {
        if(con != null)
        {
            try
            {
                con.close();
            }
            catch(SQLException se)
            {
                System.err.println ("SQLException: " + se.getMessage());
            }
        }
    }
    
    public static void main(String[] args)
    {
        Connection con = GetConnection.getConnection();
        
        if (con ==null)
        {
            System.out.println("Connection Failed.");
        }
    }
}
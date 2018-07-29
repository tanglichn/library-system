/**
 * The Loan class contains the method to record a user's loan detail and return those detail.
 *
 * @author Li Tang
 * @version 2017.11.07
 */
public class Loan
{
    // user's borrowed book and the overdue time of this book.
    private Books book;
    private Users user;
    private int overdueyear;
    private int overduemonth;
    private int overdueday;
    

    /**
     * create a loan to recored loan details.
     */
    public Loan(Books book,Users user,int overdueyear,int overduemonth,int overdueday)
    {
        this.book = book;
        this.user = user;
        this.overdueyear = overdueyear;
        this.overduemonth = overduemonth;
        this.overdueday = overdueday;
        
                        
    }

    /**
     * A method to return user.
     *
     * @return    return the user.
     */
    public Users getUser()
    {
        return user;
    }
    
    /**
     * A method to return Book.
     *
     * @return    return the Book.
     */
    public Books getBook()
    {
        return book;
    }
    
    /**
     * A method to return Overdueyear.
     *
     * @return    return the Overdueyear.
     */
    public int getOverdueyear()
    {
        return overdueyear;
    }
    
    /**
     * A method to return overduemonth.
     *
     * @return    return the overduemonth.
     */
    public int getOverduemonth()
    {
        return overduemonth;
    }
    
    /**
     * A method to return overdueday.
     *
     * @return    return the overdueday.
     */
    public int getOverdueday()
    {
        return overdueday;
    }
    
}

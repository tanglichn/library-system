import java.util.ArrayList;
import java.util.Iterator;
/**
 * The Loans class contains methods to record and return users' loan details. 
 *
 * @author Li Tang
 * @version 2017.11.19
 */
public class Loans
{
    // An ArrayList for storing users' loan record. 
    private ArrayList<Loan> loans;
    private ArrayList<Books> booklist;
    private Books book;
    

    /**
     * create a loans to record users' loan detail. 
     */
    public Loans()
    {
        // initialise instance variables
        loans = new ArrayList<>();
        
        
    }

    /**
     * A method to add a user's loan record into collection. 
     *
     * @param  loan The loan to be added. 
     */
    public void borrowBook(Loan loan)
    {
        loans.add(loan);
    }
    
    /**
     * A method to remove a user's loan record frome collection. 
     *
     * @param  loan The loan to be removed. 
     */
    public void returnBook(Loan loan)
    {
        loans.remove(loan);
    }
    
    /**
     * A method to count and return the total number of books a user is currently borrowing. 
     *
     * @return return the number of books a user is currently borrowing.
     */
    public int returnTotalbooks(Users user)
    {
        Iterator<Loan>loan = loans.iterator();
        int number = 0;
        while(loan.hasNext()){
            Loan l = loan.next();
            if (l.getUser().equals(user)){
                loan.remove();
                number++;
            }
        }
        return number;
    }
    
    /**
     * A method to return all the overdue books along with the users’ username and firstname. 
     *
     * @param  returnyear, returnmonth, returnday  compared with overduetime to find overdue book.
     * @return  return a String list contains booktitle, username and firstname. 
     */
    public ArrayList<String> returnOverduebook(int returnyear,int returnmonth,int returnday)
    {   
        ArrayList<String>returnlist=new ArrayList<>();
        for (int index=0;index<loans.size();index++){
            boolean overdue= true;
            int overdueyear = loans.get(index).getOverdueyear();
            int overduemonth = loans.get(index).getOverduemonth();
            int overdueday = loans.get(index).getOverdueday();
        if (returnyear>overdueyear){
            overdue = true;
        }
        else if ((returnyear ==overdueyear) && (returnmonth > overduemonth)){
            overdue = true;
        }
        else if ((returnyear ==overdueyear) && (returnmonth == overduemonth) && (returnday>overdueday)){
            overdue = true;
        }
        else{
            overdue = false;
        }
        if(overdue){
            returnlist.add(loans.get(index).getBook().returnTitle()+" "+loans.get(index).getUser().returnUsername()+" "+loans.get(index).getUser().returnFirstname());
        }
     }
     return returnlist;  
    }
    
    /**
     * A method to return the firstname, surname and email address name of a borrower of a given book.
     *
     * @param  ID search the ID to find the user details.
     * @return  return a collection contains firstname, surname and email address name.
     */
    public ArrayList<String> returnDetailofgivenbook(int ID)
    {
        ArrayList<String>returnlist = new ArrayList<>();
        for(int index=0;index<loans.size();index++){
            if(loans.get(index).getBook().returnID()==ID){
                returnlist.add(loans.get(index).getUser().returnFirstname()+" "+loans.get(index).getUser().returnSurname()+" "+loans.get(index).getUser().returnEmailaddress());
            }
    }
    return returnlist;
    }
    
    /**
     * A method to return those books that are currently on loan by multiple users.
     *
     * @return  return a collection contain those books. 
     */
    public ArrayList<Books> returnBooksbymultipleusers()
    {
       ArrayList<Books>returnlist = new ArrayList<>();
       for(int index=0;index<booklist.size();index++){
           if (returnDetailofgivenbook(booklist.get(index).returnID()).size()>=2){
               returnlist.add(booklist.get(index));
            }
        }
        return returnlist;
    }
}
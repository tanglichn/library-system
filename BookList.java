import java.util.ArrayList;
import java.util.Iterator;
import java.sql.*; 
/**
 * The BookList class contains methods to store a collection of books,and remove or return number of books.
 * When it adds books to the collection. Those books will also be stored in database.
 * 
 * @author Li Tang
 * @version 2017.10.25
 */
public class BookList
{
    // An ArrayList for storing the books
    private ArrayList<Books>booklist;

    /**
     * Create a BookList.
     */
    public BookList()
    {
        booklist = new ArrayList<>();
    }

    /**
     * Add books to the collection and books will also be saved in database by using GetConnection class.
     *
     * @param  books  The book to be added.
     */
    public void addBooks(Books books)
    {
        booklist.add(books);

        //Add books into database by using Getconnetion.
        try
        {
            Connection con = GetConnection.getConnection();
            
            PreparedStatement ps = con.prepareStatement("INSERT INTO bookList VALUES(?,?,?,?,?,?,?)");
            ps.setInt(1,books.returnID());
            ps.setString(2,books.returnTitle());
            ps.setString(3,books.returnAuthor());
            ps.setString(4,books.returnYear());
            ps.setString(5,books.returnPublisher());
            ps.setString(6,books.returnPublicationdate());
            ps.setInt(7,books.returnCopies());
            
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
     * Serach books by the title in booklist and add them into a collection 
     *
     * @param  title  serch the title.
     * @return  all books with the same title will be return in the returnlist
     */    
    public ArrayList<Books> findBook(String title)
    {
        ArrayList<Books>returnlist = new ArrayList<>();
        for (int index=0; index<booklist.size(); index++){
            if (booklist.get(index).returnTitle().equals(title)){
            returnlist.add(booklist.get(index));
        }      
    }
    return returnlist;
    }
    
    /**
     * Serach books by the author in booklist and add them into a collection 
     *
     * @param  author  serch the author.
     * @return  all books with the same author will be return in the returnlist
     */    
    public ArrayList<Books> findBook2(String author)
    {
        ArrayList<Books>returnlist = new ArrayList<>();
        for (int index=0; index<booklist.size(); index++){
            if (booklist.get(index).returnAuthor().equals(author)){
                returnlist.add(booklist.get(index));
            }
        }
        return returnlist;
    }
    
    /**
     * Serach books by the publisher in booklist and add them into a collection 
     *
     * @param  publisher  serch the publisher.
     * @return  all books with the same publisher will be return in the returnlist
     */  
    public ArrayList<Books> findBook3(String publisher)
    {
        ArrayList<Books>returnlist = new ArrayList<>();
        for (int index=0; index<booklist.size(); index++){
            if (booklist.get(index).returnPublisher().equals(publisher)){
                returnlist.add(booklist.get(index));
            }
        }
        return returnlist;
    }
    
    /**
     * Serach books by the publicationdate in booklist and add them into a collection 
     *
     * @param  publicationdate  serch the publicationdate.
     * @return  all books with the same publicationdate will be return in the returnlist
     */  
    public ArrayList<Books> findBook4(String publicationdate)
    {
        ArrayList<Books>returnlist = new ArrayList<>();
        for (int index=0; index<booklist.size(); index++){
            if (booklist.get(index).returnPublicationdate().equals(publicationdate)){
                returnlist.add(booklist.get(index));
            }
        }
        return returnlist;
    }
    
    /**
     * use iterator to search booklist, find book with special title and remove it. 
     *
     * @param  title  the title to match.
     */  
    public void removeBook(String title)
    {
        Iterator<Books> books = booklist.iterator();
        while(books.hasNext()){
            Books book = books.next();
            if(book.returnTitle().equals(title)){
                books.remove();
            }
        }
    }
    
    /**
     * return total number of books store in the booklist. 
     *
     * @return the number of books
     */  
    public int getNumberOfBooks()
    {
        return booklist.size();
    }    
}

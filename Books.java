import java.util.Random;
/**
 * The Books class represents a way to create book object and different method to set and return book details.   
 *
 * @author Li Tang
 * @version 2017.10.25
 */
public class Books
{
    // book details. 
    int ID;
    private String title;
    private String author;
    private String year;
    private String publisher;
    private int copies;
    private String publicationdate;
    private Random randomGenerator;

    /**
     * Create a book.
     */
    public Books(String title, String author, String year, String publisher, int copies, String publicationdate)
    {
        // Randomly generated a book ID.
        randomGenerator = new Random();
        int value = 1+randomGenerator.nextInt(100);
        this.ID = value;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.copies= copies;
        this.publicationdate= publicationdate;
    }

    /**
     * Set a book title.
     *
     * @param  title  the book's title to be set  
     */
    public void setTitle(String title)
    {
        this. title = title;       
    }
    
    /**
     * Set a book author.
     *
     * @param  author  the book's author to be set  
     */
    public void setAuthor(String author)
    {
        this. author = author;
    }
    
    /**
     * Set a book year.
     *
     * @param  year  the book's year to be set  
     */
    public void setYear(String year)
    {
        this. year = year;
    }
    
    /**
     * Set a book's publisher.
     *
     * @param  publisher  the book's publisher to be set  
     */
    public void setPublisher(String publisher)
    {
        this. publisher = publisher;
    }
    
    /**
     * Set a book's copies.
     *
     * @param  copies  the book's copies to be set  
     */
    public void setNumberofavailablecopies(int copies)
    {
        this. copies= copies;
    }
    
    /**
     * Set a book's publicationdate.
     *
     * @param  publicationdate  the book's publicationdate to be set  
     */
    public void setPublicationdate(String publicationdate)
    {
        this. publicationdate= publicationdate;
    }
    
    /**
     * return a book ID.
     *
     * @return in type of ID  
     */
    public int returnID()
    {
        return ID;
    }
    
    /**
     * return a book title.
     *
     * @return String type of title  
     */
    public String returnTitle()
    {
        return title;
    }
    
    /**
     * return a book author.
     *
     * @return String type of author  
     */
    public String returnAuthor()
    {
        return author;
    }
    
    /**
     * return a book year.
     *
     * @return String type of year  
     */
    public String returnYear()
    {
        return year;
    }
    
    /**
     * return a book Publisher.
     *
     * @return String type of Publisher  
     */
    public String returnPublisher()
    {
        return publisher;
    }
    
    /**
     * return a book Copies.
     *
     * @return int type of Copies  
     */
    public int returnCopies()
    {
        return copies;
    }
    
    /**
     * return a book Publicationdate.
     *
     * @return String type of Publicationdate  
     */
    public String returnPublicationdate()
    {
        return publicationdate;
    }
    
}


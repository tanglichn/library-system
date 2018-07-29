import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * The ModifyUsers class create a screen for user input the new user details.
 *
 * @author Li Tang
 * @version 2017.11.23
 */
public class ModifyUsers extends JFrame {
    Label id = new Label("username:");
    TextField t1=new TextField();
    Label title = new Label("firstname:");
    TextField t2 = new TextField();
    Label author = new Label("surname:");
    TextField t3=new TextField();
    Label year = new Label("house number:");
    TextField t4 = new TextField();
    Label publisher = new Label("street name:");
    TextField t5=new TextField();
    Label copies = new Label("postcode:");
    TextField t6 = new TextField();
    Button b1 = new Button("Modify");
    Button b2 = new Button("Cancel");
    JPanel panel = new JPanel();

    public static void main(String args[]){
        new ModifyBooks();
    }
    public ModifyUsers() {
        this.setTitle("Library System");
        this.setLayout(null);
        
        id.setBounds(60,100,180,40);
        this.add(id);
        t1.setBounds(240,100,180,40);
        this.add(t1);
        
        title.setBounds(500,100,180,40);
        this.add(title);
        t2.setBounds(680,100,180,40);
        this.add(t2);
        
        author.setBounds(60,200,180,40);
        this.add(author);
        t3.setBounds(240,200,180,40);
        this.add(t3);
        
        year.setBounds(500,200,180,40);
        this.add(year);
        t4.setBounds(680,200,180,40);
        this.add(t4);
        
        publisher.setBounds(60,300,180,40);
        this.add(publisher);
        t5.setBounds(240,300,180,40);
        this.add(t5);
        
        copies.setBounds(500,300,180,40);
        this.add(copies);
        t6.setBounds(680,300,180,40);
        this.add(t6);
        
        b1.setBounds(240,400,120,40);
        this.add(b1);
        b2.setBounds(500,400,120,40);
        this.add(b2);
        
        b1.setActionCommand("entry");
        b2.setActionCommand("cancel");
        setBackground(Color.yellow);
        this.setVisible(true);
        this.setSize(1000,800); 
    }  
}
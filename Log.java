import java.awt.*;
import java.awt.event.*;
/**
 * The Log class represent a interface for user log in by input username and password.
 * 
 * @author Li Tang
 * @version 2017.11.23
 */
public class Log extends Frame implements ActionListener{
    Label username = new Label("USERNAME:");//create a labal
    TextField t1=new TextField();
    Label password = new Label("PASSWORD:");
    TextField t2 = new TextField();
    Button b1 = new Button("Login");
    Button b2 = new Button("Cancel");
    int count=0;
    public static void main(String args[]){
        new Log();
    }
    
    /**
     * design the log window.
     */
    public Log(){
        this.setTitle("Log in Here");//set window label
        this.setLayout(null);
        username.setBounds(60,100,180,40);
        this.add(username);
        t1.setBounds(240,100,180,40);
        this.add(t1);
        password.setBounds(60,200,180,40);
        this.add(password);
        t2.setBounds(240,200,180,40);
        this.add(t2);
        b1.setBounds(100,300,120,40);
        this.add(b1);
        b2.setBounds(240,300,120,40);
        this.add(b2);
        b1.setActionCommand("entry");
        b2.setActionCommand("cancel");
        b1.addActionListener(this);
        b2.addActionListener(this);
        setBackground(Color.cyan);
        this.setVisible(true);
        this.setSize(600,400);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);}
        });
    }
   
   /**
     * if user entre correct username and password, it can go to next interface which created by class ModifyBooks and ModifyUsers.
     */
   public void actionPerformed(ActionEvent e){
       if (e.getActionCommand().equals("entry"))
       {
           count++; 
        //count    
        String username,password;
           if(count<3){
               username=t1.getText();
               password=t2.getText();
               if(username.equals("user")&&password.equals("666")){
                   new ModifyBooks();
                   new ModifyUsers();
                   }
                  
                   else{t1.setText("");
                       t2.setText("");
                    }
                }else
                System.exit(0);
            }
            else
            System.exit(0);//exit system.  
        }
}
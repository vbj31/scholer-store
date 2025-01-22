
package gui_registrationform;

import java.awt.*;
import static java.awt.Font.*;

import java.awt.event.*;

import java.io.*;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Toolkit;
import java.util.regex.*;
import javax.swing.JOptionPane;

public class GUI_RegistrationForm {
     
    public static void main(String[] args) throws IOException
    {
        String month[]= { "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String selectbranch[]={"Chemical","Computer","EnTC","Eletronics","Industrial","Instrumentation","IT","Mechanical","Production"};
        
     /*********************************************************************************************************/
        
        Font font1 =new Font(null,BOLD,16);
        Font font2 =new Font(null,0,16);
        
   /*****************************************frame****************************************************************/
        
        Frame f=new Frame("Registration Form");
        f.setBounds(300,50,800,950);
        f.setBackground(Color.LIGHT_GRAY);
        f.setVisible(true);
        f.setLayout(null);
        
       
       
          
       Button submit=new Button("SUBMIT");
       submit.setBackground(Color.cyan);
       submit.setFont(font1);
       submit.setBounds(200, 900,100, 30);
       f.add(submit);
       
       Button records=new Button("RECORDS");
       records.setBackground(Color.cyan);
       records.setFont(font1);
       records.setBounds(400, 900,100, 30);
       f.add(records);
       records.setVisible(true);
       
       
       /*********************************************************************************************************************/
       
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
               System.exit(0);
               
            }
        
        
        });
        

        
   /******************************************header****************************************************************/
        Label form=new Label("STUDENT REGISTRATION FORM");
        form.setBounds(200,50,400,100);
        Font font =new Font(null,BOLD|ITALIC, 24);
        form.setFont(font);
        f.add(form);
       
        
 /******************************************first name****************************************************************/
        int x=100,y=140,w=130,h=50;
        Label fname=new Label("1. FIRST NAME");
        fname.setBounds(x,y,w,h);
        f.add(fname);
        fname.setFont(font1);
        
        TextField nametext=new TextField();
        nametext.setBounds(260,150,130,30);
        f.add(nametext);
        nametext.setFont(font2);
        
 /******************************************last name****************************************************************/

        Label lname=new Label("2. LAST NAME");
        lname.setBounds(x,y+50,w,h);
        f.add(lname);
        lname.setFont(font1);
        
        TextField lnametext=new TextField();
        lnametext.setBounds(260,200,130,30);
        f.add(lnametext);
        lnametext.setFont(font2);

  /******************************************m no****************************************************************/
        
        Label mno=new Label("3. MOBILE NO.");
        mno.setBounds(x,y+100,w,h);
        f.add(mno);
        mno.setFont(font1);
        
        TextField mnotext=new TextField();
        mnotext.setBounds(260,250,130,30);
        f.add(mnotext);
        mnotext.setFont(font2);
        
        Label mnowar=new Label("(Enter 10 digit no.without code )");
        mnowar.setBounds(450,y+110,250,30);
        f.add(mnowar);
        mnowar.setFont(font2);
        
        
  /******************************************email****************************************************************/
       
        Label email=new Label("4. EMAIL");
        email.setBounds(x,y+150,w,h);
        f.add(email);
        email.setFont(font1);
        
        TextField emailtext=new TextField();
        emailtext.setBounds(260,300,200,30);
        f.add(emailtext);
        emailtext.setFont(font2);
        
   /******************************************DOB****************************************************************/

        Label dob=new Label("4. DOB");
        dob.setBounds(x,y+200,w,h);
        f.add(dob);
        dob.setFont(font1);
        
       Choice d=new Choice();
       d.setBounds(260,350,50,50);
       d.setFont(font2);
       for(int i=1;i<=31;i++){
           String s=Integer.toString(i);
          d.add(s);
       }
       f.add(d); 
       
       Choice m=new Choice();
       m.setBounds(310,350,60,50);
       m.setFont(font2);
       for(int i=0;i<=11;i++)
       {
           m.add(month[i]);
       }
       f.add(m);
       
       Choice year=new Choice();
       year.setBounds(370,350,70,50);
       year.setFont(font2);
       for(int i=1980;i<=2018;i++){
           String s=Integer.toString(i);
          year.add(s);
       }
       f.add(year); 
       
  /******************************************add****************************************************************/
      
        Label add=new Label("5. ADDRESS");
        add.setBounds(x,y+250,w,h);
        f.add(add);
        add.setFont(font1);
        
        TextField addtext =new TextField();
        addtext.setBounds(260,400,300,100);
        f.add(addtext);
        addtext.setFont(font2);
        
   /******************************************city****************************************************************/
      
        Label city=new Label("6. CITY");
        city.setBounds(x,y+380,w,h);
        f.add(city);
        city.setFont(font1);
        
        TextField citytext =new TextField();
        citytext.setBounds(260,530,130,30);
        f.add(citytext);
        citytext.setFont(font2);
    
       /******************************************state****************************************************************/

        Label state=new Label("7. STATE");
        state.setBounds(x,y+430,w,h);
        f.add(state);
        state.setFont(font1);
        
        TextField statetext =new TextField();
        statetext.setBounds(260,580,130,30);
        f.add(statetext);
        statetext.setFont(font2);
        
  /******************************************country****************************************************************/
        TextField countrytext =new TextField();
        countrytext.setBounds(260,630,130,30);
        f.add(countrytext);
        countrytext.setFont(font2);
        
       
        Label coutry=new Label("8. COUNTRY");
        coutry.setBounds(x,y+480,w,h);
        f.add(coutry);
        coutry.setFont(font1);
        
      /*  TextField countrytext =new TextField();
        countrytext.setBounds(260,630,130,30);
        f.add(countrytext);
        countrytext.setFont(font2);*/

 /******************************************gender****************************************************************/

         Label gender=new Label("9. GENDER");
         gender.setBounds(x,y+530,w,h);
        f.add(gender);
        gender.setFont(font1);
        
       CheckboxGroup cg=new CheckboxGroup();
       Checkbox c1=new Checkbox("Male",true,cg);
       c1.setBounds(260,680,60,30);
       c1.setFont(font2);
       f.add(c1);
       
       
       Checkbox c2=new Checkbox("Female",false,cg);
       c2.setBounds(340,680,70,30);
       c2.setFont(font2);
       f.add(c2);
  /******************************************10th per****************************************************************/
      
        Label xper=new Label("10. 10th %");
        xper.setBounds(x,y+580,w,h);
        f.add(xper);
        xper.setFont(font1);
        
        TextField xpertext=new TextField();
        xpertext.setBounds(260,730,70,30);
        f.add(xpertext);
        xpertext.setFont(font2);
        
        /******************************************12th per****************************************************************/
    
        Label xiiper=new Label("11. 12th %");
        xiiper.setBounds(x,y+630,w,h);
        f.add(xiiper);
        xiiper.setFont(font1);
        
        TextField xiitext=new TextField();
        xiitext.setBounds(260,780,70,30);
        f.add(xiitext);
        xiitext.setFont(font2);
        
  /******************************************branch****************************************************************/
       
        Label branch=new Label("12. BRANCH");
        branch.setBounds(x,y+680,w,h);
        f.add(branch);
        branch.setFont(font1);
        
        
       Choice b=new Choice();
       b.setBounds(260,830,150,50);
       b.setFont(font2);
       for(int i=0;i<=8;i++)
       {
           b.add(selectbranch[i]);
       }
       f.add(b);
       /**************************************************************************************************************/
       
       
       
 //     Pattern p=Pattern.compile(/*"^[7-9][0-9]{9}$"*//*"\\d{10}"*/"[0-9]+");
   //    Matcher ma=p.matcher(mnotext.getText());
      
         /* Pattern pe=Pattern.compile("/^{[A-Za-z0-9_\-\.]}\@([A-Za-z0-9_\-\.]){1,}\.$/");
          Matcher mat=pe.matcher(emailtext.getText());
       */
       
  /******************************************submit****************************************************************/

       FileWriter fwriter=new FileWriter("C:\\Users\\Admin\\Documents\\NetBeansProjects\\GUI_RegistrationForm\\Records.txt",true);
       
        Dialog dg=new Dialog(f);
        dg.setBounds(200,200, 400, 500);
        
      

        Label exittext=new Label("Do you want to EXIT?");
        exittext.setBounds(50,50,300,50);
        dg.add(exittext);
        dg.setLayout(null);
        exittext.setFont(font2);
        
        TextArea area=new TextArea();
        area.setBounds(30,140,350,250 );
        dg.add(area);
        area.setVisible(false);
        area.setFont(font2);
        // area.setText("one or mo1re field you left empty..plz fill\n for return press no");
          //area.setVisible(true);
        
        
        
        Button yes=new Button("Yes");
        yes.setBounds(70,100,50,30);
        yes.setBackground(Color.WHITE);
        yes.setFont(font2);
        yes.setFocusable(false);
        dg.add(yes);
        
        
        
        
        Button no1=new Button("No");
        no1.setBounds(150,100,50,30);
        no1.setBackground(Color.WHITE);
        no1.setFont(font2);
        dg.add(no1);
        
        yes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              
           try {
                  fwriter.write("First Name = "+nametext.getText());
                  fwriter.write(System.lineSeparator());
                  fwriter.write("Last Name = "+lnametext.getText());
                  fwriter.write(System.lineSeparator());
                  fwriter.write("Mobile no. = "+mnotext.getText());
                  fwriter.write(System.lineSeparator());
                  fwriter.write("Email Address = "+emailtext.getText());
                  fwriter.write(System.lineSeparator());
                  fwriter.write("DOB = "+d.getSelectedItem()+" "+m.getSelectedItem()+" "+year.getSelectedItem());
                  fwriter.write(System.lineSeparator());
                  fwriter.write("Address = "+addtext.getText());
                  fwriter.write(System.lineSeparator());
                 
                  fwriter.write("City = "+citytext.getText());
                  fwriter.write(System.lineSeparator());
                  fwriter.write("State = "+statetext.getText());
                  fwriter.write(System.lineSeparator());
                  fwriter.write("Country = "+countrytext.getText());
                  fwriter.write(System.lineSeparator());
                  fwriter.write("Gender = "+cg.getSelectedCheckbox().getLabel());
                  fwriter.write(System.lineSeparator());
                  fwriter.write("10th Percentage = "+xpertext.getText());
                  fwriter.write(System.lineSeparator());
                  fwriter.write("12th Percentage = "+xiitext.getText());
                  fwriter.write(System.lineSeparator());
                  fwriter.write("Branch = "+b.getSelectedItem());
                  fwriter.write(System.lineSeparator()); 
                  fwriter.write(System.lineSeparator());
                  
                  f.dispose();
                    
                  fwriter.close();
               
                    } catch (IOException ex) {
                        Logger.getLogger(GUI_RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  
                       
                
                
            
            }
        });
        
         no1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
              dg.setVisible(false);
              
            }
        });
         
      
       submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                dg.setVisible(true);
               
                
                if(mnotext.getText().trim().isEmpty()||nametext.getText().trim().isEmpty()||emailtext.getText().trim().isEmpty()||addtext.getText().trim().isEmpty()||citytext.getText().trim().isEmpty()||statetext.getText().trim().isEmpty()||xpertext.getText().trim().isEmpty()||xiitext.getText().trim().isEmpty())
                {      
                    exittext.setText("For go back press NO");
                    area.setText("one or more field you left empty..plz fill\n for return press no");
                    yes.setVisible(false);
                    area.setVisible(true);
                    dg.setVisible(true);
                }
                else if(!mnotext.getText().toString().matches("^[7-9][0-9]{9}$"))
                {
                    dg.setVisible(false);
                     JOptionPane.showMessageDialog(null,"Invalid mobile no plz correct");
                     
           
                }
                else{
                    
                    exittext.setText("For exit presssed Yes");
                     area.setText("You entered information is:\n"+"First Name = "+nametext.getText()+"\nLast Name = "+lnametext.getText()+"\nMobile no. = "+mnotext.getText()+"\nEmail Address = "+emailtext.getText()+"\nDOB = "+d.getSelectedItem()+" "+m.getSelectedItem()+" "+year.getSelectedItem()+"\nAddress = "+addtext.getText()+"\nCity = "+citytext.getText()+"\nState = "+statetext.getText()+"\nCountry = "+countrytext.getText()+"\nGender = "+cg.getSelectedCheckbox().getLabel()+"\n10th Percentage = "+xpertext.getText()+"\n12th Percentage = "+xiitext.getText()+"\nBranch = "+b.getSelectedItem());
                      area.setVisible(true);
                       dg.setVisible(true);
           
                      yes.setVisible(true);
                }
                      
               
            }
            
        });

    
            }
    
}
               
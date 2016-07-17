package studentprofile;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class StudentProfile extends JFrame implements ActionListener{

    //INSTANCE VARIABLES
    String msg;
    int s_age;
    String gender_m, gender_f;
    String s_sex, s_b1, s_b2, s_address, s_course, s_sem, s_campus;
    Button btn1;
    Button btn2;
    Label l1;
    Label l2;
    Label l3;
    Label l4;
    Label l5;
    Label l6;
    Label l7;
    Label l8;
    Label l9;
    TextField t1;
    Choice c1; //Pop up of choices to choose from
    CheckboxGroup cbg; //Groups together a set of check boxes
    Checkbox ck1; //Parameters: name, current state, CheckBoxGroup it belongs tp
    Checkbox ck2;
    Checkbox cl1;
    Checkbox cl2;
    TextArea t2; 
    TextArea t3;
    Choice course;
    Choice sem;
    Choice age;
    List list1; //Scrolling list of text items
    
    
    //CONSTRUCTOR FUNCTION
    public StudentProfile(){
        gender_m = "";
        gender_f = "";
        btn1 = new Button("Print");
        btn2 = new Button("Clear");
        l1 = new Label("Name :", Label.LEFT); //Puts label on the left
        l2 = new Label("Age :", Label.LEFT);
        l3 = new Label("Sex(M/F) :", Label.LEFT);
        l4 = new Label("Benefits :", Label.LEFT);
        l5 = new Label("Address :", Label.LEFT);
        l6 = new Label("Course :", Label.LEFT);
        l7 = new Label("Semester :", Label.LEFT);
        l8 = new Label("Campus :", Label.LEFT);
        t1 = new TextField();
        c1 = new Choice();
        cbg = new CheckboxGroup(); 
        ck1 = new Checkbox("Male", false, cbg);
        ck2 = new Checkbox("Female", false, cbg);
        cl1 = new Checkbox("Laptop", false);
        cl2 = new Checkbox("Scholarship", false);
        t2 = new TextArea(" ", 200, 130);
        t3 = new TextArea(" ");
        course = new Choice();
        sem = new Choice();
        age = new Choice();
        list1 = new List();
        
        setForeground(Color.BLACK);
        setLayout(null);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7); 
        add(l8);
        add(t1);
        add(t2);
        add(t3);
        add(ck1);
        add(ck2);
        add(course);
        add(sem);
        add(age);
        add(btn1);
        add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        add(cl1);
        add(cl2);
        add(list1);
        course.add("Select");
        course.add("BSc Computer Science");
        course.add("MSc Computer Science");
        course.add("BSc Astrophtsics");
        course.add("M.Sc Astro Physics");
        course.add("B.Sc Mathematics");
        list1.add("Campus 1");
        list1.add("Campus 2");
        sem.add("Select");
        sem.add("1");
        sem.add("2");
        sem.add("3");
        sem.add("4");
        sem.add("5");
        sem.add("6");
        age.add(("Select"));
        age.add("17");
        age.add("18");
        age.add("19");
        age.add("20");
        age.add("21");
        age.add("22");
        age.add("23");
        age.add("24");
        
        //Set bounds of labels
        l1.setBounds(95, 145, 100, 20); //Moves and sets the size of l1
        l2.setBounds(95,200,100,20);
        l3.setBounds(95,250,100,20);
        l4.setBounds(95,295,100,20);
        l5.setBounds(95,340,100,20);
        l6.setBounds(95,420,100,20);
        l7.setBounds(95,465,100,20);
        l8.setBounds(95,505,100,20);
        
        //Set bounds of everthing else
        t1.setBounds(200,144,180,30);
        age.setBounds(200,200,180,70);
        ck1.setBounds(200,240,70,45);
        ck2.setBounds(270,240,70,45);
        cl1.setBounds(200,285,70,45);
        cl2.setBounds(270,285,85,45);
        course.setBounds(200,420,180,40);
        sem.setBounds(200,465,180,40);
        list1.setBounds(200,500,180,40);
        t2.setBounds(200,345,180,60);
        t3.setBounds(459,135,390,460);
        btn1.setBounds(160,565,70,30);
        btn2.setBounds(250,565,70,30);
    }
    
    //OVVERRIDE PAING METHOD FOR OBJECT
    @Override
    public void paint(Graphics g){
        g.setFont(new Font("Calibari",Font.BOLD,18));
        g.setColor(Color.BLUE);
        g.drawString("Student Profile using AWT Controls", 320, 80);
        g.drawRect(60,115,365,520);
        g.drawRect(435,115,440,520);
    }
    
    //ACTION PERFORMED METHOD
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            //If user clicks print continue
            String name = t1.getText();
            s_address = t2.getText();
            int i = age.getSelectedIndex(); //Get's selected age from choice pop up
            int j = course.getSelectedIndex();
            int k = sem.getSelectedIndex();
            int l = list1.getSelectedIndex();
            
            switch(i){ //Goes through i array like an if statement and checks the position in the array and gives a result based on that
                case 1: s_age=17;
                break;
                case 2: s_age=18;
                break;
                case 3: s_age=19;
                break;
                case 4: s_age=20;
                break;
                case 5: s_age=21;
                break;
                case 6: s_age=22;
                break;
                case 7: s_age=23;
                break;
            }
            
            switch(j){
                case 0: s_campus="Campus 1";
                break;
                case 1: s_campus = "Campus 2";
                break;
            }
            
            switch(k){
                case 1: s_sem = "1";
                break;
                case 2: s_sem = "2";
                break;
                case 3: s_sem = "3";
                break;
                case 4: s_sem = "4";
                break;
                case 5: s_sem = "5";
                break;
                case 6: s_sem = "6";
            }
            
            switch(l){
                case 1: s_course = "BSc Computer Science";
                break;
                case 2: s_course = "BSc Astrophtsics";
                break;
                case 3: s_course = "M.Sc Astro Physics";
                break;
                case 4: s_course = "B.Sc Mathematics";
                break;
            }
            
            if(ck1.getState()){ //Gets state of checkbox. Either true or false.
                s_sex = "Male";
            }
            
            if(ck2.getState()){
                s_sex = "Female";
            }
            
            if(cl1.getState()){
                s_b1 = "Laptop";
            }else{
                s_b1 = "";
            }
            
            if(cl2.getState()){
                s_b2 = "Scholarship";
            }else{
                s_b2 = "";
            }
            
            
            
            t3.setText("\n "+" Name\t :\t"+name+"\n\n"+" Age\t :\t"+s_age+"\n\n"+" Sex\t :\t"+s_sex+
            "\n\n Benefits\t :\t"+s_b1+" , "+s_b2+"\n\n Address\t :\t"+s_address+
            "\n\n Course\t :\t"+s_course+"\n\n Semester\t :\t"+s_sem+"\n\n Campus\t :\t"+s_campus+"\n\n\n\n\n\n\tDone by Niall O' Connor.");
        }
        
        if(e.getSource() == btn2){
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
           }
    }
    
    //MAIN METHOD
    public static void main(String[] args) {
        StudentProfile stu = new StudentProfile();
        stu.setSize(new Dimension(930, 660));
        stu.setTitle("Simple student profile");
        stu.setVisible(true);
    }
}
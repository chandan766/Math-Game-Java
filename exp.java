import java.util.Random; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import java.awt.event.*; 

public class exp {
    static String[] ques;
    public static int count=0,i=0;
    public static int a;
    public static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    public static JProgressBar jb;
    public static JFrame f1;
    public static void main(String[] args){
        exp ex = new exp();
        ex.banner();
        ex.iterate();
        

    }
    public void banner(){
       f1 = new JFrame();
       jb = new JProgressBar();
        f1.setLayout(null);
        f1.setContentPane(new JLabel(new ImageIcon("mathq.png")));
        jb = new JProgressBar(0,1000);
        jb.setBounds(0,230,640,8);
        jb.setStringPainted(false);
        jb.setBorder(null);
        jb.setBackground(Color.gray);
        jb.setForeground(new Color(255,255,255));
        f1.setSize(640,360);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);
        f1.setUndecorated(true);
        f1.setVisible(true);
        try{
            Thread.sleep(5000);
            f1.add(jb);
            }
            catch(Exception e){
                System.out.println(e);
            }
    }
    // For iterating progress bar
    public void iterate(){  
        int i=0;  
        while(i<=800){    
          jb.setValue(i);    
          i=i+20;    
          try{Thread.sleep(100);}catch(Exception e){}   
        }    
        f1.dispose();
        exp ex = new exp();
        ex.game();
    }

    public String[] question(){
        String[] arr = {"+","-","x","÷"};
        Random random = new Random();
        int first = random.nextInt(100); 
        int ind = random.nextInt(4);
        int second = random.nextInt(100); 
        String[] ques = new String[3];
        if (first>second){
        ques[0]=Integer.toString(first);
        ques[1]= arr[ind];
        ques[2]=Integer.toString(second);
        if (ques[1].equals("÷")){
            if(Integer.parseInt(ques[0]) % Integer.parseInt(ques[2])==0){
                return ques;
            }
            else{
                return question();
            }
        }
        else{
            return ques;
        }
        }
    return question();
    }
    public int calc(int a, int b,String c){
        int d=0;
        if (c.equals("+")){
            d = a+b;
        }
        else if(c.equals("-")){
            d = a-b;
        }
        else if (c.equals("x")){
             d = a*b;
        }
        else if(c.equals("÷")){
            d = a/b;
        }
        return d;
        }

        public void game(){
        exp ex = new exp();
        Random random = new Random();
        ques = ex.question();
        JFrame f = new JFrame();
        JLabel l = new JLabel("Score");
        l.setBounds(30,10,100,40);
        l.setForeground(new Color(0,0,0));
        l.setFont(new Font("Arial", Font.BOLD, 18));
        
        JLabel l1 = new JLabel("0",SwingConstants.CENTER);
        l1.setBounds(100,10,100,40);
        l1.setForeground(new Color(	13, 0, 0));
        l1.setBackground(new Color(230, 198, 162));
        l1.setFont(new Font("Arial", Font.BOLD, 18));
        Border border = BorderFactory.createLineBorder(Color.red);
        l1.setBorder(border);
        l1.setOpaque(true);
        
        JLabel timer = new JLabel("120");
        timer.setBounds(230,10,100,40);
        timer.setForeground(new Color(0,0,0));
        timer.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel lbl = new JLabel("Math Quiz Game",SwingConstants.CENTER);
        lbl.setBounds(300,10,250,40);
        lbl.setForeground(new Color(	13, 0, 0));
        lbl.setBackground(new Color(230, 198, 162));
        lbl.setFont(new Font("Arial", Font.BOLD, 18));
        lbl.setBorder(border);
        lbl.setOpaque(true);
		lbl.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                JOptionPane jp = new JOptionPane();
                jp.showMessageDialog(f1,"This software is developed by chandan maurya.\n For any query/feedback mail on chandanmaurya766@gmail.com","About",JOptionPane.PLAIN_MESSAGE);
            }
        });

        JLabel l2 = new JLabel(ques[0]+ques[1]+ques[2]+"=",SwingConstants.RIGHT);
        l2.setBounds(70,80,250,80);
        l2.setFont(new Font("Arial", Font.BOLD, 40));


        JLabel ans = new JLabel("",SwingConstants.LEFT);
        ans.setBounds(320,80,250,80);
        ans.setBackground(new Color(255,0,0));
        ans.setFont(new Font("Arial", Font.BOLD, 40));

        b1 = new JButton("1");
        b1.setBounds(50,180,100,50);
        b1.setBackground(new Color(230, 198, 162));
        b1.setForeground(Color.black);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.setFocusPainted(false);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
        {
            
            String num = b1.getActionCommand();
            ans.setText(num);
            b1.setBackground(new Color(50, 31, 222));
            b1.setForeground(new Color(255,255,255));
            b2.setBackground(new Color(230, 198, 162));
            b2.setForeground(new Color(0,0,0));
            b3.setBackground(new Color(230, 198, 162));
            b3.setForeground(new Color(0,0,0));
            b4.setBackground(new Color(230, 198, 162));
            b4.setForeground(new Color(0,0,0));
            b5.setBackground(new Color(230, 198, 162));
            b5.setForeground(new Color(0,0,0));
            b6.setBackground(new Color(230, 198, 162));
            b6.setForeground(new Color(0,0,0));
            b7.setBackground(new Color(230, 198, 162));
            b7.setForeground(new Color(0,0,0));
            b8.setBackground(new Color(230, 198, 162));
            b8.setForeground(new Color(0,0,0));
            
        }
    });
        b2 = new JButton("12");
        b2.setBounds(170,180,100,50);
        b2.setBackground(new Color(230, 198, 162));
        b2.setForeground(Color.black);
        b2.setFont(new Font("Arial", Font.BOLD, 15));
        b2.setFocusPainted(false);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
        {
            
            String num = b2.getActionCommand();
            ans.setText(num);
            b2.setBackground(new Color(50, 31, 222));
            b2.setForeground(new Color(255,255,255));
            b1.setBackground(new Color(230, 198, 162));
            b1.setForeground(new Color(0,0,0));
            b3.setBackground(new Color(230, 198, 162));
            b3.setForeground(new Color(0,0,0));
            b4.setBackground(new Color(230, 198, 162));
            b4.setForeground(new Color(0,0,0));
            b5.setBackground(new Color(230, 198, 162));
            b5.setForeground(new Color(0,0,0));
            b6.setBackground(new Color(230, 198, 162));
            b6.setForeground(new Color(0,0,0));
            b7.setBackground(new Color(230, 198, 162));
            b7.setForeground(new Color(0,0,0));
            b8.setBackground(new Color(230, 198, 162));
            b8.setForeground(new Color(0,0,0));
        }
    });
        b3 = new JButton("3");
        b3.setBounds(290,180,100,50);
        b3.setBackground(new Color(230, 198, 162));
        b3.setForeground(Color.black);
        b3.setFont(new Font("Arial", Font.BOLD, 15));
        b3.setFocusPainted(false);
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
        {
            
            String num = b3.getActionCommand();
            ans.setText(num);
            b3.setBackground(new Color(50, 31, 222));
            b3.setForeground(new Color(255,255,255));
            b2.setBackground(new Color(230, 198, 162));
            b2.setForeground(new Color(0,0,0));
            b1.setBackground(new Color(230, 198, 162));
            b1.setForeground(new Color(0,0,0));
            b4.setBackground(new Color(230, 198, 162));
            b4.setForeground(new Color(0,0,0));
            b5.setBackground(new Color(230, 198, 162));
            b5.setForeground(new Color(0,0,0));
            b6.setBackground(new Color(230, 198, 162));
            b6.setForeground(new Color(0,0,0));
            b7.setBackground(new Color(230, 198, 162));
            b7.setForeground(new Color(0,0,0));
            b8.setBackground(new Color(230, 198, 162));
            b8.setForeground(new Color(0,0,0));
        }
    });
        b4 = new JButton("4");
        b4.setBounds(410,180,100,50);
        b4.setBackground(new Color(230, 198, 162));
        b4.setForeground(Color.black);
        b4.setFont(new Font("Arial", Font.BOLD, 15));
        b4.setFocusPainted(false);
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
        {
            
            String num = b4.getActionCommand();
            ans.setText(num);
            b4.setBackground(new Color(50, 31, 222));
            b4.setForeground(new Color(255,255,255));
            b2.setBackground(new Color(230, 198, 162));
            b2.setForeground(new Color(0,0,0));
            b3.setBackground(new Color(230, 198, 162));
            b3.setForeground(new Color(0,0,0));
            b1.setBackground(new Color(230, 198, 162));
            b1.setForeground(new Color(0,0,0));
            b5.setBackground(new Color(230, 198, 162));
            b5.setForeground(new Color(0,0,0));
            b6.setBackground(new Color(230, 198, 162));
            b6.setForeground(new Color(0,0,0));
            b7.setBackground(new Color(230, 198, 162));
            b7.setForeground(new Color(0,0,0));
            b8.setBackground(new Color(230, 198, 162));
            b8.setForeground(new Color(0,0,0));
        }
    });
        b5 = new JButton("5");
        b5.setBounds(50,250,100,50);
        b5.setBackground(new Color(230, 198, 162));
        b5.setForeground(Color.black);
        b5.setFont(new Font("Arial", Font.BOLD, 15));
        b5.setFocusPainted(false);
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
        {
            
            String num = b5.getActionCommand();
            ans.setText(num);
            b5.setBackground(new Color(50, 31, 222));
            b5.setForeground(new Color(255,255,255));
            b2.setBackground(new Color(230, 198, 162));
            b2.setForeground(new Color(0,0,0));
            b3.setBackground(new Color(230, 198, 162));
            b3.setForeground(new Color(0,0,0));
            b4.setBackground(new Color(230, 198, 162));
            b4.setForeground(new Color(0,0,0));
            b1.setBackground(new Color(230, 198, 162));
            b1.setForeground(new Color(0,0,0));
            b6.setBackground(new Color(230, 198, 162));
            b6.setForeground(new Color(0,0,0));
            b7.setBackground(new Color(230, 198, 162));
            b7.setForeground(new Color(0,0,0));
            b8.setBackground(new Color(230, 198, 162));
            b8.setForeground(new Color(0,0,0));
        }
    });
        b6 = new JButton("6");
        b6.setBounds(170,250,100,50);
        b6.setBackground(new Color(230, 198, 162));
        b6.setForeground(Color.black);
        b6.setFont(new Font("Arial", Font.BOLD, 15));
        b6.setFocusPainted(false);
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
        {
            
            String num = b6.getActionCommand();
            ans.setText(num);
            b6.setBackground(new Color(50, 31, 222));
            b6.setForeground(new Color(255,255,255));
            b2.setBackground(new Color(230, 198, 162));
            b2.setForeground(new Color(0,0,0));
            b3.setBackground(new Color(230, 198, 162));
            b3.setForeground(new Color(0,0,0));
            b4.setBackground(new Color(230, 198, 162));
            b4.setForeground(new Color(0,0,0));
            b5.setBackground(new Color(230, 198, 162));
            b5.setForeground(new Color(0,0,0));
            b1.setBackground(new Color(230, 198, 162));
            b1.setForeground(new Color(0,0,0));
            b7.setBackground(new Color(230, 198, 162));
            b7.setForeground(new Color(0,0,0));
            b8.setBackground(new Color(230, 198, 162));
            b8.setForeground(new Color(0,0,0));
        }
    });
        b7 = new JButton("7");
        b7.setBounds(290,250,100,50);
        b7.setBackground(new Color(230, 198, 162));
        b7.setForeground(Color.black);
        b7.setFont(new Font("Arial", Font.BOLD, 15));
        b7.setFocusPainted(false);
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
        {
            
            String num = b7.getActionCommand();
            ans.setText(num);
            b7.setBackground(new Color(50, 31, 222));
            b7.setForeground(new Color(255,255,255));
            b2.setBackground(new Color(230, 198, 162));
            b2.setForeground(new Color(0,0,0));
            b3.setBackground(new Color(230, 198, 162));
            b3.setForeground(new Color(0,0,0));
            b4.setBackground(new Color(230, 198, 162));
            b4.setForeground(new Color(0,0,0));
            b5.setBackground(new Color(230, 198, 162));
            b5.setForeground(new Color(0,0,0));
            b6.setBackground(new Color(230, 198, 162));
            b6.setForeground(new Color(0,0,0));
            b1.setBackground(new Color(230, 198, 162));
            b1.setForeground(new Color(0,0,0));
            b8.setBackground(new Color(230, 198, 162));
            b8.setForeground(new Color(0,0,0));
        }
    });
        b8 = new JButton("8");
        b8.setBounds(410,250,100,50);
        b8.setBackground(new Color(230, 198, 162));
        b8.setForeground(Color.black);
        b8.setFont(new Font("Arial", Font.BOLD, 15));
        b8.setFocusPainted(false);
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
        {
            
            String num = b8.getActionCommand();
            ans.setText(num);
            b8.setBackground(new Color(50, 31, 222));
            b8.setForeground(new Color(255,255,255));
            b2.setBackground(new Color(230, 198, 162));
            b2.setForeground(new Color(0,0,0));
            b3.setBackground(new Color(230, 198, 162));
            b3.setForeground(new Color(0,0,0));
            b4.setBackground(new Color(230, 198, 162));
            b4.setForeground(new Color(0,0,0));
            b5.setBackground(new Color(230, 198, 162));
            b5.setForeground(new Color(0,0,0));
            b6.setBackground(new Color(230, 198, 162));
            b6.setForeground(new Color(0,0,0));
            b7.setBackground(new Color(230, 198, 162));
            b7.setForeground(new Color(0,0,0));
            b1.setBackground(new Color(230, 198, 162));
            b1.setForeground(new Color(0,0,0));
        }
    });

        JButton nxt = new JButton("Next");
        nxt.setBounds(240,350,100,50);
        nxt.setBackground(new Color(0,255,0));
        nxt.setForeground(Color.white);
        nxt.setFont(new Font("Arial", Font.BOLD, 20));
        nxt.setFocusPainted(false);
        nxt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
        {
            b1.setBackground(new Color(230, 198, 162));
            b1.setForeground(new Color(0,0,0));
            b2.setBackground(new Color(230, 198, 162));
            b2.setForeground(new Color(0,0,0));
            b3.setBackground(new Color(230, 198, 162));
            b3.setForeground(new Color(0,0,0));
            b4.setBackground(new Color(230, 198, 162));
            b4.setForeground(new Color(0,0,0));
            b5.setBackground(new Color(230, 198, 162));
            b5.setForeground(new Color(0,0,0));
            b6.setBackground(new Color(230, 198, 162));
            b6.setForeground(new Color(0,0,0));
            b7.setBackground(new Color(230, 198, 162));
            b7.setForeground(new Color(0,0,0));
            b8.setBackground(new Color(230, 198, 162));
            b8.setForeground(new Color(0,0,0));
            if (ans.getText().equals(Integer.toString(a))){
                count = count+1;
                l1.setText(Integer.toString(count));
            }
            ques = ex.question();
            l2.setText(ques[0]+ques[1]+ques[2]+"=");
            int flag = random.nextInt(8)+1;
            a = ex.calc(Integer.parseInt(ques[0]),Integer.parseInt(ques[2]),ques[1]);
            switch(flag){
                case 1:
                {
                    b1.setText(Integer.toString(a));
                    b2.setText(Integer.toString(a-random.nextInt(a)));
                    b3.setText(Integer.toString(a+random.nextInt(a)));
                    b4.setText(Integer.toString(a-random.nextInt(a)));
                    b5.setText(Integer.toString(a+random.nextInt(a)));
                    b6.setText(Integer.toString(a-random.nextInt(a)));
                    b7.setText(Integer.toString(a+random.nextInt(a)));
                    b8.setText(Integer.toString(a-random.nextInt(a)));
                    break;
                }
                case 2:
                {
                    b2.setText(Integer.toString(a));
                    b1.setText(Integer.toString(a+random.nextInt(a)));
                    b3.setText(Integer.toString(a+random.nextInt(a)));
                    b4.setText(Integer.toString(a-random.nextInt(a)));
                    b5.setText(Integer.toString(a+random.nextInt(a)));
                    b6.setText(Integer.toString(a-random.nextInt(a)));
                    b7.setText(Integer.toString(a+random.nextInt(a)));
                    b8.setText(Integer.toString(a-random.nextInt(a)));
                    break;
                }
                case 3:
                {
                    b3.setText(Integer.toString(a));
                    b1.setText(Integer.toString(a+random.nextInt(a)));
                    b2.setText(Integer.toString(a-random.nextInt(a)));
                    b4.setText(Integer.toString(a-random.nextInt(a)));
                    b5.setText(Integer.toString(a+random.nextInt(a)));
                    b6.setText(Integer.toString(a-random.nextInt(a)));
                    b7.setText(Integer.toString(a+random.nextInt(a)));
                    b8.setText(Integer.toString(a-random.nextInt(a)));
                    break;
                }
                case 4:
                {
                    b4.setText(Integer.toString(a));
                    b1.setText(Integer.toString(a+random.nextInt(a)));
                    b2.setText(Integer.toString(a-random.nextInt(a)));
                    b3.setText(Integer.toString(a+random.nextInt(a)));
                    b5.setText(Integer.toString(a+random.nextInt(a)));
                    b6.setText(Integer.toString(a-random.nextInt(a)));
                    b7.setText(Integer.toString(a+random.nextInt(a)));
                    b8.setText(Integer.toString(a-random.nextInt(a)));
                    break;
                }
                case 5:
                {
                    b5.setText(Integer.toString(a));
                    b1.setText(Integer.toString(a+random.nextInt(a)));
                    b2.setText(Integer.toString(a-random.nextInt(a)));
                    b3.setText(Integer.toString(a+random.nextInt(a)));
                    b4.setText(Integer.toString(a-random.nextInt(a)));
                    b6.setText(Integer.toString(a-random.nextInt(a)));
                    b7.setText(Integer.toString(a+random.nextInt(a)));
                    b8.setText(Integer.toString(a-random.nextInt(a)));
                    break;
                }
                case 6:
                {
                    b6.setText(Integer.toString(a));
                    b1.setText(Integer.toString(a+random.nextInt(a)));
                    b2.setText(Integer.toString(a-random.nextInt(a)));
                    b3.setText(Integer.toString(a+random.nextInt(a)));
                    b4.setText(Integer.toString(a-random.nextInt(a)));
                    b5.setText(Integer.toString(a+random.nextInt(a)));
                    b7.setText(Integer.toString(a+random.nextInt(a)));
                    b8.setText(Integer.toString(a-random.nextInt(a)));
                    break;
                }
                case 7:
                {
                    b7.setText(Integer.toString(a));
                    b1.setText(Integer.toString(a+random.nextInt(a)));
                    b2.setText(Integer.toString(a-random.nextInt(a)));
                    b3.setText(Integer.toString(a+random.nextInt(a)));
                    b4.setText(Integer.toString(a-random.nextInt(a)));
                    b5.setText(Integer.toString(a+random.nextInt(a)));
                    b6.setText(Integer.toString(a-random.nextInt(a)));
                    b8.setText(Integer.toString(a-random.nextInt(a)));
                    break;
                }
                case 8:
                {
                    b8.setText(Integer.toString(a));
                    b1.setText(Integer.toString(a+random.nextInt(a)));
                    b2.setText(Integer.toString(a-random.nextInt(a)));
                    b3.setText(Integer.toString(a+random.nextInt(a)));
                    b4.setText(Integer.toString(a-random.nextInt(a)));
                    b5.setText(Integer.toString(a+random.nextInt(a)));
                    b6.setText(Integer.toString(a-random.nextInt(a)));
                    b7.setText(Integer.toString(a+random.nextInt(a)));
                    break;
                }
            }
            ans.setText("");
        }
    });


        f.add(l);
        f.add(l1);
        f.add(timer);
        f.add(lbl);
        f.add(l2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(nxt);
        f.add(ans);
        f.setSize(600,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(	208, 155, 93));
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);

        int flag = random.nextInt(8)+1;
        a = ex.calc(Integer.parseInt(ques[0]),Integer.parseInt(ques[2]),ques[1]);
        switch(flag){
            case 1:
            {
                b1.setText(Integer.toString(a));
                b2.setText(Integer.toString(a-random.nextInt(a)));
                b3.setText(Integer.toString(a+random.nextInt(a)));
                b4.setText(Integer.toString(a-random.nextInt(a)));
                b5.setText(Integer.toString(a+random.nextInt(a)));
                b6.setText(Integer.toString(a-random.nextInt(a)));
                b7.setText(Integer.toString(a+random.nextInt(a)));
                b8.setText(Integer.toString(a-random.nextInt(a)));
                break;
            }
            case 2:
            {
                b2.setText(Integer.toString(a));
                b1.setText(Integer.toString(a+random.nextInt(a)));
                b3.setText(Integer.toString(a+random.nextInt(a)));
                b4.setText(Integer.toString(a-random.nextInt(a)));
                b5.setText(Integer.toString(a+random.nextInt(a)));
                b6.setText(Integer.toString(a-random.nextInt(a)));
                b7.setText(Integer.toString(a+random.nextInt(a)));
                b8.setText(Integer.toString(a-random.nextInt(a)));
                break;
            }
            case 3:
            {
                b3.setText(Integer.toString(a));
                b1.setText(Integer.toString(a+random.nextInt(a)));
                b2.setText(Integer.toString(a-random.nextInt(a)));
                b4.setText(Integer.toString(a-random.nextInt(a)));
                b5.setText(Integer.toString(a+random.nextInt(a)));
                b6.setText(Integer.toString(a-random.nextInt(a)));
                b7.setText(Integer.toString(a+random.nextInt(a)));
                b8.setText(Integer.toString(a-random.nextInt(a)));
                break;
            }
            case 4:
            {
                b4.setText(Integer.toString(a));
                b1.setText(Integer.toString(a+random.nextInt(a)));
                b2.setText(Integer.toString(a-random.nextInt(a)));
                b3.setText(Integer.toString(a+random.nextInt(a)));
                b5.setText(Integer.toString(a+random.nextInt(a)));
                b6.setText(Integer.toString(a-random.nextInt(a)));
                b7.setText(Integer.toString(a+random.nextInt(a)));
                b8.setText(Integer.toString(a-random.nextInt(a)));
                break;
            }
            case 5:
            {
                b5.setText(Integer.toString(a));
                b1.setText(Integer.toString(a+random.nextInt(a)));
                b2.setText(Integer.toString(a-random.nextInt(a)));
                b3.setText(Integer.toString(a+random.nextInt(a)));
                b4.setText(Integer.toString(a-random.nextInt(a)));
                b6.setText(Integer.toString(a-random.nextInt(a)));
                b7.setText(Integer.toString(a+random.nextInt(a)));
                b8.setText(Integer.toString(a-random.nextInt(a)));
                break;
            }
            case 6:
            {
                b6.setText(Integer.toString(a));
                b1.setText(Integer.toString(a+random.nextInt(a)));
                b2.setText(Integer.toString(a-random.nextInt(a)));
                b3.setText(Integer.toString(a+random.nextInt(a)));
                b4.setText(Integer.toString(a-random.nextInt(a)));
                b5.setText(Integer.toString(a+random.nextInt(a)));
                b7.setText(Integer.toString(a+random.nextInt(a)));
                b8.setText(Integer.toString(a-random.nextInt(a)));
                break;
            }
            case 7:
            {
                b7.setText(Integer.toString(a));
                b1.setText(Integer.toString(a+random.nextInt(a)));
                b2.setText(Integer.toString(a-random.nextInt(a)));
                b3.setText(Integer.toString(a+random.nextInt(a)));
                b4.setText(Integer.toString(a-random.nextInt(a)));
                b5.setText(Integer.toString(a+random.nextInt(a)));
                b6.setText(Integer.toString(a-random.nextInt(a)));
                b8.setText(Integer.toString(a-random.nextInt(a)));
                break;
            }
            case 8:
            {
                b8.setText(Integer.toString(a));
                b1.setText(Integer.toString(a+random.nextInt(a)));
                b2.setText(Integer.toString(a-random.nextInt(a)));
                b3.setText(Integer.toString(a+random.nextInt(a)));
                b4.setText(Integer.toString(a-random.nextInt(a)));
                b5.setText(Integer.toString(a+random.nextInt(a)));
                b6.setText(Integer.toString(a-random.nextInt(a)));
                b7.setText(Integer.toString(a+random.nextInt(a)));
                break;
            }
        }
        int i=120; 
        try{Thread.sleep(2000);}catch(Exception e){} 
        while(true){    
            timer.setText(Integer.toString(i));    
            i=i-1;    
            try{Thread.sleep(1000);
                if(i<0){
                    JOptionPane jp = new JOptionPane();
                    jp.showMessageDialog(f1,"Total Score: "+l1.getText());
                    l1.setText("0");
                    i=120;
                }
            }catch(Exception e){} 
        }
        }
}

//Evan White

        import javax.swing.*;
	import java.util.Calendar;
	import java.awt.*;
	import java.awt.event.*;
	import java.io.*;
	
public class GuiProjectEW extends JFrame implements ItemListener, ActionListener{
	
	private JPanel topPanel, leftPanel, midPanel, rightPanel, mainPanel;
	private JCheckBox trainCB, clockCB, bikeCB, carCB;
	private JTextField topText, midText, leftText, rightText;
    private ImageIcon triviaPic1 = new ImageIcon("Desert5.jpg");
    private ImageIcon triviaPic2 = new ImageIcon("OnePunch.jpg");
    private ImageIcon triviaPic3 = new ImageIcon("DarkNut.jpg");
    private JButton leftButton, rightButton, picButton;
    private String labelMessage = "Change Picture?";
    private int counter = 1;
    private ImageIcon[] triviaPics = {triviaPic1, triviaPic2, triviaPic3};
	
//---------------------------------------------------------
public static void main(String[] args) {
		
		JFrame frame = new GuiProjectEW();
		frame.setPreferredSize(new Dimension(700, 600));
		frame.pack();
		frame.setVisible(true);
		
		WindowListener w = new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		};
		frame.addWindowListener(w);
	}

//---------------------------------------------------------
     GuiProjectEW()
  {
	//construct components
    	 super("Trivia Game using Gui");
	
    topPanel = new JPanel();
    topPanel.setLayout(new GridLayout(1,1));
    topPanel.setPreferredSize(new Dimension(300,400));
    topPanel.setBorder(BorderFactory.createMatteBorder
                        (20, 20, 20, 20, Color.gray));

	leftPanel = new JPanel();
	leftPanel.setLayout(new GridLayout(1,1));
	leftPanel.setPreferredSize(new Dimension(150,70));
	leftPanel.setBorder(BorderFactory.createMatteBorder
	                    (20, 20, 20, 0, Color.gray));
	                    
	midPanel = new JPanel();
	midPanel.setLayout(new GridLayout(5,1));
	midPanel.setPreferredSize(new Dimension(200,100));
	midPanel.setBorder(BorderFactory.createMatteBorder
	                    (20, 20, 20, 20, Color.gray));

	rightPanel = new JPanel();
	rightPanel.setLayout(new GridLayout(1,1));
	rightPanel.setPreferredSize(new Dimension(100,70));
	rightPanel.setBorder(BorderFactory.createMatteBorder
	                    (20, 0, 20, 20, Color.gray));
	
	mainPanel = new JPanel();
	mainPanel.setLayout(new BorderLayout());
	mainPanel.setPreferredSize(new Dimension(700,600));
	
        picButton = new JButton(triviaPics[0]);
        topPanel.add(picButton);

//=====
    midText = new JTextField("Which One(s) is/are Featured?");
        midPanel.add(midText);
        
    trainCB = new JCheckBox("Train", false);
    clockCB = new JCheckBox("Clock", false);
    bikeCB = new JCheckBox("Bike", false);
    carCB = new JCheckBox("Car", false);
   
    trainCB.addItemListener(this);
    clockCB.addItemListener(this);
    bikeCB.addItemListener(this);
    carCB.addItemListener(this);
    
    midPanel.add(trainCB);
    midPanel.add(clockCB);
    midPanel.add(bikeCB);
    midPanel.add(carCB);
//=====
    
    leftButton = new JButton("Change Picture?");
    leftButton.addActionListener(this);
    leftPanel.add(leftButton);
    
    rightButton = new JButton("Submit?");
    rightButton.addActionListener(this);
    rightPanel.add(rightButton);
	  
    mainPanel.add(topPanel, BorderLayout.NORTH);
    mainPanel.add(leftPanel, BorderLayout.WEST);
	mainPanel.add(midPanel, BorderLayout.CENTER);
	mainPanel.add(rightPanel, BorderLayout.EAST);
    
    setContentPane(mainPanel);
	
  }
     
   //---------------------------------------------------------
  public void actionPerformed(ActionEvent e)
  
  {        	
       if(e.getSource() == rightButton) {
            System.exit(0);
      }
      else if(e.getSource() == leftButton){
          picButton.setIcon(triviaPics[counter]);
          counter++;
          counter = counter%triviaPics.length;
      }
  }
  public void itemStateChanged(ItemEvent ie){
    System.out.println("R");
    }

}


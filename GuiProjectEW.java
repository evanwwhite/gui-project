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
	private ImageIcon trivaPic = new ImageIcon("Image.jpg");
	private JButton button;
	private JLabel label;
	private String labelMessage = "Change Picture?";
	
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
	
	
     topText = new JTextField("Pic:");
        topPanel.add(topText);

    rightText = new JTextField("Submit?");
        rightPanel.add(rightText);
//=====
    midText = new JTextField("Which One Is Featured?");
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
    
    button = new JButton("Change Picture?");
	label = new JLabel (labelMessage + "0 ");
	leftPanel.add(button);
	  
    mainPanel.add(topPanel, BorderLayout.NORTH);
    mainPanel.add(leftPanel, BorderLayout.WEST);
	mainPanel.add(midPanel, BorderLayout.CENTER);
	mainPanel.add(rightPanel, BorderLayout.EAST);
    
    setContentPane(mainPanel);
	button.addActionListener(this);
  }
     
   //---------------------------------------------------------
    

 		
 	




}


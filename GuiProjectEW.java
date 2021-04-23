//Evan White

    import javax.swing.*;
	import java.util.Calendar;
	import java.awt.*;
	import java.awt.event.*;
	import java.io.*;
	
public class GuiProjectEW extends JFrame implements ActionListener{
	
	private JPanel leftPanel, midPanel, rightPanel, mainPanel;
	
	

	
//---------------------------------------------------------
public static void main(String[] args) {
		
		JFrame frame = new GuiProjectEW();
		frame.setPreferredSize(new Dimension(1000, 700));
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
	
	
	leftPanel = new JPanel();
	leftPanel.setLayout(new GridLayout(1,1));
	leftPanel.setPreferredSize(new Dimension(150,70));
	leftPanel.setBorder(BorderFactory.createMatteBorder
	                    (25, 25, 25, 0, Color.blue));
	                    
	midPanel = new JPanel();
	midPanel.setLayout(new GridLayout(3,1));
	midPanel.setPreferredSize(new Dimension(200,100));
	midPanel.setBorder(BorderFactory.createMatteBorder
	                    (25, 25, 25, 25, Color.blue));

	rightPanel = new JPanel();
	rightPanel.setLayout(new GridLayout(2,1));
	rightPanel.setPreferredSize(new Dimension(100,70));
	rightPanel.setBorder(BorderFactory.createMatteBorder
	                    (25, 0, 25, 25, Color.blue));
	
	mainPanel = new JPanel();
	mainPanel.setLayout(new BorderLayout());
	mainPanel.setPreferredSize(new Dimension(1000,700));
	
	mainPanel.add(leftPanel, BorderLayout.WEST);
	mainPanel.add(midPanel, BorderLayout.CENTER);
	mainPanel.add(rightPanel, BorderLayout.EAST);
	
	//construct JPanel component
	
	
	//add the two components to JPanel
	
	
	//set JPanel to be the content pane
	
  }
     
   //---------------------------------------------------------
     public void actionPerformed(ActionEvent e)
 	{
 		
 	}




}
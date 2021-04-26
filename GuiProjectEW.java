//Evan White

        import javax.swing.*;
	import java.util.Calendar;
	import java.awt.*;
	import java.awt.event.*;
	import java.io.*;
	
public class GuiProjectEW extends JFrame implements ItemListener{
	
	private JPanel topPanel, leftPanel, midPanel, rightPanel, mainPanel;
	private JCheckBox trainCB, clockCB, bikeCB, carCB;
	private JTextField topText, midText, leftText, rightText;

	
//---------------------------------------------------------
public static void main(String[] args) {
		
		JFrame frame = new GuiProjectEW();
		frame.setPreferredSize(new Dimension(500, 400));
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
    topPanel.setPreferredSize(new Dimension(300,100));
    topPanel.setBorder(BorderFactory.createMatteBorder
                        (20, 20, 20, 20, Color.gray));

	leftPanel = new JPanel();
	leftPanel.setLayout(new GridLayout(1,1));
	leftPanel.setPreferredSize(new Dimension(150,70));
	leftPanel.setBorder(BorderFactory.createMatteBorder
	                    (20, 20, 20, 0, Color.gray));
	                    
	midPanel = new JPanel();
	midPanel.setLayout(new GridLayout(1,1));
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
	mainPanel.setPreferredSize(new Dimension(500,400));
	
	
     topText = new JTextField("a;sldkfja");
        topPanel.add(topText);
    
	 leftText = new JTextField("Pepper poops");
        leftPanel.add(leftText);

    rightText = new JTextField("Hello");
        rightPanel.add(rightText);
    
    trainCB = new JCheckBox("Train", false);
    clockCB = new JCheckBox("Clock", false);
    bikeCB = new JCheckBox("Bike", false);
    carCB = new JCheckBox("Car", false);

    midPanel.add(trainCB);
    midPanel.add(clockCB);
    midPanel.add(bikeCB);
    midPanel.add(carCB);

    trainCB.addItemListener(This);
    clockCB.addItemListener(This);
    bikeCB.addItemListener(This);
    carCB.addItemListener(This);

    mainPanel.add(topPanel, BorderLayout.NORTH);
    mainPanel.add(leftPanel, BorderLayout.WEST);
	mainPanel.add(midPanel, BorderLayout.CENTER);
	mainPanel.add(rightPanel, BorderLayout.EAST);
    
    setContentPane(mainPanel);
  }
     
   //---------------------------------------------------------
     public void itemStateChange(ItemChange ic)
 	{
         
        if(ic.getItemSelectable() == trainCB)
		{
			if (ic.getStateChange() == ItemChange.DESELECTED)
			{
				train = "";
				lookFor = train + clock + bike + car;
				dietField2.setText(lookFor);
			//	dietField2.setText(wwCB.getLabel() + " has been deselected.");

			}
			else
			{
				ww = "Weight Watchers ";
				diets = ww + sb + adkins;
				dietField2.setText(diets);
			//	dietField2.setText(wwCB.getLabel());
			}
		}

      if(ie.getItemSelectable() == sbCB)
		{
			if (ie.getStateChange() == ItemEvent.DESELECTED)
			{
				sb = "";
				diets = ww + sb + adkins;
				dietField2.setText(diets);
				//dietField2.setText(sbCB.getLabel() + " has been deselected.");
			}
			else
			{
				sb = "South Beach ";
				diets = ww + sb + adkins;
				dietField2.setText(diets);
			    //dietField2.setText(sbCB.getLabel());
			}
		}

		if(ie.getItemSelectable() == adkinsCB)
		{
			if (ie.getStateChange() == ItemEvent.DESELECTED)
			{
				adkins = "";
				diets = ww + sb + adkins;
				dietField2.setText(diets);
				//dietField2.setText(adkinsCB.getLabel() + " has been deselected.");
			}
			else
			{
				adkins = "Adkins ";
				diets = ww + sb + adkins;
				dietField2.setText(diets);
				//dietField2.setText(adkinsCB.getLabel());
			}
		}	

 		
 	}




}


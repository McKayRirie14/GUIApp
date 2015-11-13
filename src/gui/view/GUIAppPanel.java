package gui.view;

import javax.swing.*;

import gui_controller.GUIAppController;
import java.awt.event.*;

/**
 * 
 * @author mrir2917
 *@version 0.x November 13, 2015
 */

public class GUIAppPanel extends JPanel 
{
	private GUIAppController baseController;
	private JButton firstButton;
	private JTextField firstField;
	private SpringLayout baseLayout;
	
	public GUIAppPanel(GUIAppController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton= new JButton("Please do not click the button");
		firstField = new JTextField("words can be typed here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Helper method to load all GUI components into the panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstField);
	}
	
	/**
	 * Helper method for arranging the panel.
	 * Dumping ground for generated code.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST,firstButton,107,SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -32, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstField, 37, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstField, -24, SpringLayout.SOUTH, this);
	}
	private void setupListeners()
	{
		firstButton.addActionListener (new ActionListener()
		{
			public void actionPreformed (ActionEvent click)
			{
				firstField.setText("Wow, this is the most amazing click ever!");
			}
		});
	}
}

package gui.view;

import javax.swing.JFrame;
import gui_controller.GUIAppController;
/**
 * 
 * @author mrir2917
 *@version 0.x November 13, 2015
 */

public class GUIAppFrame extends JFrame
{
	private GUIAppController baseController;
	private GUIAppPanel basePanel;
	
	public GUIAppFrame(GUIAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIAppPanel(baseController);
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public GUIAppController getBaseController()
	{
		return baseController;
	}
	
}

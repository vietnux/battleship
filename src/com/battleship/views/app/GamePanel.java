/* 
 * Creation : 11 févr. 2015
 * Project Computer Science L2 Semester 4 - BattleShip
 */
package com.battleship.views.app;

import com.battleship.exceptions.ExecError;
import com.battleship.views.tools.PagePanel;
import com.battleship.views.tools.WindowFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;





/**
 * 
 * 
 * @date    11 févr. 2015
 * @author  Constantin MASSON
 * @author  Anthony CHAFFOT
 * @author  Jessica FAVIN
 */
public class GamePanel extends PagePanel{
    private     JPanel              p_centerPane;
    
    private     InformationPanel    p_info;
    private     FleetPanel          p_fleet;
    private     RadarPanel          p_radar;
    private     ChatPanel           p_chat;
    private     HeadBar             p_headbar;
    private     GridBagConstraints  gc;
    
    
    
    
    
    //**************************************************************************
    // CONSTRUCTOR
    //**************************************************************************
    /**
     * Create a new Game panel
     * @param pFrame Frame containing this panel
     * @throws ExecError error if unable to create this panel
     */
    public GamePanel(WindowFrame pFrame) throws ExecError{
        super(pFrame);
        this.p_headbar  = new HeadBar();
        this.gc         = new GridBagConstraints();
        initComponents();
    }
    
    @Override
    public void initPage(){
    }
    
    
    
    
    
    //**************************************************************************
    // METHODS
    //**************************************************************************
    private void initComponents(){
        this.setLayout(new BorderLayout());
        p_centerPane = new JPanel();
        p_centerPane.setLayout(new GridBagLayout()); 
        p_centerPane.setBackground(Color.red);
        
        p_info = new InformationPanel();
        p_info.setBackground(Color.ORANGE);
        
        p_fleet = new FleetPanel();
        p_fleet.setBackground(Color.CYAN);
        
        p_radar = new RadarPanel();
        p_radar.setBackground(Color.DARK_GRAY);
        
        p_chat = new ChatPanel();
        p_chat.setBackground(Color.PINK);
        
        //Put the 2 panels into the boerderlayout's center
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(10, 10, 0, 10);
        gc.gridx = 0;
        gc.gridy = 0;
        p_centerPane.add(p_radar, gc);
        gc.gridx = 1;
        gc.gridy = 0;
        p_centerPane.add(p_fleet, gc);
        
        this.add(p_headbar, BorderLayout.NORTH);
        this.add(p_centerPane, BorderLayout.CENTER);
        this.add(p_chat, BorderLayout.EAST);
        this.add(p_info, BorderLayout.SOUTH);
    }
    
    @Override
    protected void goNextPage(){
    }
    
    @Override
    protected void goPreviousPage(){
    }
}
/* 
 * Creation : 28 March 2015
 * Project Computer Science L2 Semester 4 - BattleShip
 */
package com.battleship.views.tools;

import javax.swing.JOptionPane;





/**
 * <h1>UiDialog</h1>
 * <p>public class UiDialog</p>
 * <p>Manage display for JDialog</p>
 *
 * 
 * @since   Mar 28, 2015
 * @author  Constantin MASSON
 * @author  Anthony CHAFFOT
 * @author  Jessica FAVIN
 */
public abstract class UiDialog {
    //**************************************************************************
    // Functions simple dialog
    //**************************************************************************
    /**
     * Display a message jsut for information
     * @param pTitle    title
     * @param pMsg      message
     */
    public static void showInfoDialog(String pTitle, String pMsg){
        JOptionPane opt = new JOptionPane();
        opt.showMessageDialog(null, pMsg, pTitle, JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    //**************************************************************************
    // Functions warngin with return param
    //**************************************************************************
    /**
     * Display a warning dialog message and as for confirmation
     * @param pTitle    dialog title (Displayed at the window top)
     * @param pMsg      Message to display
     * @return          choice
     */
    public static int showYesNoWarning(String pTitle, String pMsg){
        JOptionPane opt = new JOptionPane();
        int choice = opt.showConfirmDialog(null, pMsg, pTitle,
                                            JOptionPane.YES_NO_CANCEL_OPTION, 
                                            JOptionPane.QUESTION_MESSAGE);
        return choice;
    }
    
    /**
     * Display a confirm dialog and return value
     * @param pTitle    dialog title (Displayed at the window top)
     * @param pMsg      Message to display
     * @return          choice
     */
    public static int showConfirmDialog(String pTitle, String pMsg){
        JOptionPane opt = new JOptionPane();
        int choice = opt.showConfirmDialog(null, pMsg, pTitle,
                                            JOptionPane.OK_OPTION, 
                                            JOptionPane.QUESTION_MESSAGE);
        return choice;
    }
    
    
    
    //**************************************************************************
    // Functions warngin without return param
    //**************************************************************************
    /**
     * Display a JDialog with warning message
     * @param pTitle    dialog title (Displayed at the window top)
     * @param pMsg      Message to display
     */
    public static void showWarning(String pTitle, String pMsg){
        JOptionPane opt = new JOptionPane();
        opt.showMessageDialog(null, pMsg, pTitle, JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Display a JDialog with error message
     * @param pTitle    dialog title (Displayed at the window top)
     * @param pMsg      Message to display
     */
    public static void showError(String pTitle, String pMsg){
        JOptionPane opt = new JOptionPane();
        opt.showMessageDialog(null, pMsg, pTitle, JOptionPane.ERROR_MESSAGE);
    }
}

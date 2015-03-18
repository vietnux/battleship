/* 
 * Creation : 17 févr. 2015
 * Project Computer Science L2 Semester 4 - BattleShip
 */
package com.battleship.main;





/**
 * <h1>DebugTrack</h1>
 * <p>public abstract class DebugTrack</p>
 * <p>Create a debug trace for data</p>
 *
 * @date    Mar 12, 2015
 * @author  Constantin MASSON
 * @author  Anthony CHAFFOT
 * @author  Jessica FAVIN
 */
public abstract class DebugTrack {
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Display message about initialization as a class creation.
     * @param str message to display
     */
    public static void showInitMsg(String str){
        System.out.println(" * "+str);
    }
    
    /**
     * Display message about program execution as button processed etc
     * @param str message to display
     */
    public static void showExecMsg(String str){
        System.out.println(" -> "+str);
    }
    
    /**
     * Display error message, then return line
     * @param str message to display
     */
    public static void showErrMsg(String str){
        System.err.println(str);
    }
}
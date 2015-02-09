/* 
 * Creation : Feb 9, 2015
 * Project Computer Science L2 Semester 4 - BattleShip
 */
package com.battleship.models;





/**
 * <h1>FleetGridSquare</h1>
 * <p>
 * public class FleetGridSquare<br/>
 * extends FleetGridModel
 * </p>
 * 
 *
 * @date    Feb 9, 2015
 * @author  Constantin MASSON
 * @author  Jessica FAVIN
 * @author  Anthony CHAFFOT
 */
public class FleetGridSquare extends FleetGridModel{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    
    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new FleetGrid with square coordinates
     * @param pWidth    Grid width
     * @param pHeight   Grid Height
     * @param pOwner    FleetGrid owner
     */
    public FleetGridSquare(int pWidth, int pHeight, Player pOwner){
        super(pWidth, pHeight, pOwner);
    }
    
    
    
    
    
    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public BoxMap getNextBoxMap(int pX, int pY){
        return null; //To Do
    }
    
    
    
    
    
    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}

/* 
 * Creation : Feb 9, 2015
 * Project Computer Science L2 Semester 4 - BattleShip
 */
package com.battleship.models.game;

import com.battleship.behaviors.Target;
import com.battleship.constants.FleetGridConstants;
import com.battleship.constants.GameConstants;
import com.battleship.models.weapons.*;
import java.util.ArrayList;





/**
 * <h1>Player</h1>
 * <p>
 * public class Player
 * </p>
 * 
 * <p>
 * This class represent a player during a battleship game. Data could be loaded 
 * from account or new created but player instance is only for one game.
 * </p>
 *
 * 
 * @date    Feb 9, 2015
 * @author  Constantin MASSON
 * @author  Jessica FAVIN
 * @author  Anthony CHAFFOT
 */
public class Player implements FleetGridConstants, GameConstants{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     String                  name;
    private     FleetGridModel          fleetGrid;
    private     ArrayList<Weapon>       listWeapons;
    private     int                     score;
    private     int                     currentWeaponIndex;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new player. Player name is unknown, score = 0 
     * List weapon is fill with the default weapon and fleetGrid is not set
     */
    private Player() {
        this.name               = "Unknown";
        this.score              = 0;
        this.listWeapons        = new ArrayList();
        this.fleetGrid          = null;
        
        //Add default weapon and set current weapon to this weapon
        this.listWeapons.add(new Missile(this, INFINITE));
        this.currentWeaponIndex = 0;
    }
    
    /**
     * Create the FleetGrid according to the parameter configuration (Could not be
     * modified later)<br/>
     * Parameter pGridType determine which kind of grid will be created
     * @param pGridWidth    Grid Width
     * @param pGridHeight   Grid Height
     * @param pGridType     Grid Type (Could be square or hexagon)
     */
    public void initFleetGrid(int pGridWidth, int pGridHeight, int pGridType) {
        switch(pGridType){
            case GRID_SQUARE:
                this.fleetGrid  = new FleetGridSquare(pGridWidth, pGridHeight, this);
                break;
            case GRID_HEXAGON:
                this.fleetGrid  = new FleetGridHexagon(pGridWidth, pGridHeight, this);
                break;
        }
    }
    
    
    
    
    
    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Switch player weapon. Get the next player weapon.
     */
    public void switchWeaponNext() {
        this.currentWeaponIndex++;
        if(this.currentWeaponIndex>=this.listWeapons.size()){
            this.currentWeaponIndex = 0;
        }
    }
    
    /**
     * Switch player weapon. Get the previous player weapon.
     */
    public void switchWeaponPrevious(){
        this.currentWeaponIndex--;
        if(this.currentWeaponIndex<0){
            this.currentWeaponIndex = this.listWeapons.size();
        }
    }
    
    /**
     * Switch weapon to the one at position pValue. Position start a 0, means that 
     * if player got 3 weapons, get number 2 return the last weapon. Do nothing 
     * in case of invalid value
     * @param pValue weapon index to switch with
     */
    public void switchWeaponWith(int pValue){
        if(pValue<0 || pValue >= this.listWeapons.size()){
            return;
        }
        this.currentWeaponIndex = pValue;
    }
    
    /**
     * Try to launch a shot at position pX, pY
     * @param pX x target coordinate in the Target matrix
     * @param pY y target coordinate in the Target matrix
     * @param pWhere target matrix
     * @return true if is able to shoot, otherwise, return false
     */
    public boolean shootAt(int pX, int pY, Target[][] pWhere) {
        Target target =  pWhere[pY][pX];
        if(target.isValidTarget()){
            this.listWeapons.get(this.currentWeaponIndex)
                            .fireAt(pX, pY, pWhere, this.fleetGrid);
            return true;
        }
        return false;
    }
    
    /**
     * Aim a target. 
     * @param pX x target coordinate in the Target matrix
     * @param pY y target coordinate in the Target matrix
     * @param pWhere target matrix
     * @return true if can be aimed by player, otherwise, return false
     */
    public boolean aimAt(int pX, int pY, Target[][] pWhere){
        Target target =  pWhere[pY][pX];
        //To do in weapon, then, add here 
        return false;
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    /**
     * Return current player's name
     * @return name of this player
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Set player name
     * @param pValue new player name, if is not a String or empty, throw exception
     */
    public void setName(String pValue) {
        /*
         * ATTENTION
         * To finish!!
         * Add exception and check if valid name (Not empty, valid lenght...)
         */
        this.name = pValue;
    }
}
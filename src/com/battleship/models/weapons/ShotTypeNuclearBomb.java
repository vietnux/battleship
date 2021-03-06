/*
 * Class :      ShotTypeNuclearBomb
 * Creation:    Feb 15, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.battleship.models.weapons;

import com.battleship.behaviors.Target;





/**
 * <h1>ShotTypeNuclearBomb</h1>
 * <p>
 * public class ShotTypeNuclearBomb<br/>
 * implements ShotType
 * </p>
 *
 *
 * 
 * @since   Feb 15, 2015
 * @author  Constantin MASSON
 * @author  Jessica FAVIN
 * @author  Anthony CHAFFOT
 * @see     ShotType
 */
public class ShotTypeNuclearBomb implements ShotType{
    //**************************************************************************
    // Fire Functions
    //**************************************************************************
    @Override
    public boolean fireSquareGrid(int pX, int pY, Target[][] pTarget) {
        for(int i=-2; i<3; i++){
            for(int j=-2; j<3; j++){
                Weapon.hitTargetIfExists(pX+i, pY+j, pTarget);
            }
        }
        Weapon.hitTargetIfExists(pX, pY-3, pTarget);
        Weapon.hitTargetIfExists(pX, pY+3, pTarget);
        Weapon.hitTargetIfExists(pX-3, pY, pTarget);
        Weapon.hitTargetIfExists(pX+3, pY, pTarget);
        return true;
    }

    @Override
    public boolean fireHexagonGrid(int pX, int pY, Target[][] pTarget) {
        if(pX%2==0){
            Weapon.hitTargetIfExists(pX, pY, pTarget);
            Weapon.hitTargetIfExists(pX, pY-1, pTarget);
            Weapon.hitTargetIfExists(pX, pY+1, pTarget);
            Weapon.hitTargetIfExists(pX-1, pY-1, pTarget);
            Weapon.hitTargetIfExists(pX-1, pY, pTarget);
            Weapon.hitTargetIfExists(pX+1, pY-1, pTarget);
            Weapon.hitTargetIfExists(pX+1, pY, pTarget);
            
            Weapon.hitTargetIfExists(pX, pY-2, pTarget);
            Weapon.hitTargetIfExists(pX-1, pY-2, pTarget);
            Weapon.hitTargetIfExists(pX-2, pY-1, pTarget);
            Weapon.hitTargetIfExists(pX-2, pY, pTarget);
            Weapon.hitTargetIfExists(pX-2, pY+1, pTarget);
            Weapon.hitTargetIfExists(pX-1, pY+1, pTarget);
            Weapon.hitTargetIfExists(pX, pY+2, pTarget);
            Weapon.hitTargetIfExists(pX+1, pY+1, pTarget);
            Weapon.hitTargetIfExists(pX+2, pY+1, pTarget);
            Weapon.hitTargetIfExists(pX+2, pY, pTarget);
            Weapon.hitTargetIfExists(pX+2, pY-1, pTarget);
            Weapon.hitTargetIfExists(pX+1, pY-2, pTarget);
            
            Weapon.hitTargetIfExists(pX+3, pY-1, pTarget);
            Weapon.hitTargetIfExists(pX+3, pY, pTarget);
            Weapon.hitTargetIfExists(pX+4, pY, pTarget);
            
            Weapon.hitTargetIfExists(pX-3, pY-1, pTarget);
            Weapon.hitTargetIfExists(pX-3, pY, pTarget);
            Weapon.hitTargetIfExists(pX-4, pY, pTarget);
            
            
        } else{
            Weapon.hitTargetIfExists(pX, pY-1, pTarget);
            Weapon.hitTargetIfExists(pX-1, pY, pTarget);
            Weapon.hitTargetIfExists(pX, pY, pTarget);
            Weapon.hitTargetIfExists(pX+1, pY, pTarget);
            Weapon.hitTargetIfExists(pX-1, pY+1, pTarget);
            Weapon.hitTargetIfExists(pX, pY+1, pTarget);
            Weapon.hitTargetIfExists(pX+1, pY+1, pTarget);
            
            Weapon.hitTargetIfExists(pX, pY-2, pTarget);
            Weapon.hitTargetIfExists(pX-1, pY-1, pTarget);
            Weapon.hitTargetIfExists(pX-2, pY-1, pTarget);
            Weapon.hitTargetIfExists(pX-2, pY, pTarget);
            Weapon.hitTargetIfExists(pX-2, pY+1, pTarget);
            Weapon.hitTargetIfExists(pX-1, pY+2, pTarget);
            Weapon.hitTargetIfExists(pX, pY+2, pTarget);
            Weapon.hitTargetIfExists(pX+1, pY+2, pTarget);
            Weapon.hitTargetIfExists(pX+2, pY+1, pTarget);
            Weapon.hitTargetIfExists(pX+2, pY, pTarget);
            Weapon.hitTargetIfExists(pX+2, pY-1, pTarget);
            Weapon.hitTargetIfExists(pX+1, pY-1, pTarget);
            
            Weapon.hitTargetIfExists(pX+3, pY, pTarget);
            Weapon.hitTargetIfExists(pX+3, pY+1, pTarget);
            Weapon.hitTargetIfExists(pX+4, pY, pTarget);
            
            Weapon.hitTargetIfExists(pX-3, pY, pTarget);
            Weapon.hitTargetIfExists(pX-3, pY+1, pTarget);
            Weapon.hitTargetIfExists(pX-4, pY, pTarget);
        }
        return true;
    }
    
    
    //**************************************************************************
    // Aim Functions
    //**************************************************************************
    @Override
    public boolean aimSquareGrid(int pX, int pY, Target[][] pTarget){
        for(int i=-2; i<3; i++){
            for(int j=-2; j<3; j++){
                Weapon.aimTargetIfExists(pX+i, pY+j, pTarget);
            }
        }
        Weapon.aimTargetIfExists(pX, pY-3, pTarget);
        Weapon.aimTargetIfExists(pX, pY+3, pTarget);
        Weapon.aimTargetIfExists(pX-3, pY, pTarget);
        Weapon.aimTargetIfExists(pX+3, pY, pTarget);
        return true;
    }

    @Override
    public boolean aimHexagonGrid(int pX, int pY, Target[][] pTarget){
        if(pX%2==0){
            Weapon.aimTargetIfExists(pX, pY, pTarget);
            Weapon.aimTargetIfExists(pX, pY-1, pTarget);
            Weapon.aimTargetIfExists(pX, pY+1, pTarget);
            Weapon.aimTargetIfExists(pX-1, pY-1, pTarget);
            Weapon.aimTargetIfExists(pX-1, pY, pTarget);
            Weapon.aimTargetIfExists(pX+1, pY-1, pTarget);
            Weapon.aimTargetIfExists(pX+1, pY, pTarget);
            
            Weapon.aimTargetIfExists(pX, pY-2, pTarget);
            Weapon.aimTargetIfExists(pX-1, pY-2, pTarget);
            Weapon.aimTargetIfExists(pX-2, pY-1, pTarget);
            Weapon.aimTargetIfExists(pX-2, pY, pTarget);
            Weapon.aimTargetIfExists(pX-2, pY+1, pTarget);
            Weapon.aimTargetIfExists(pX-1, pY+1, pTarget);
            Weapon.aimTargetIfExists(pX, pY+2, pTarget);
            Weapon.aimTargetIfExists(pX+1, pY+1, pTarget);
            Weapon.aimTargetIfExists(pX+2, pY+1, pTarget);
            Weapon.aimTargetIfExists(pX+2, pY, pTarget);
            Weapon.aimTargetIfExists(pX+2, pY-1, pTarget);
            Weapon.aimTargetIfExists(pX+1, pY-2, pTarget);
            
            Weapon.aimTargetIfExists(pX+3, pY-1, pTarget);
            Weapon.aimTargetIfExists(pX+3, pY, pTarget);
            Weapon.aimTargetIfExists(pX+4, pY, pTarget);
            
            Weapon.aimTargetIfExists(pX-3, pY-1, pTarget);
            Weapon.aimTargetIfExists(pX-3, pY, pTarget);
            Weapon.aimTargetIfExists(pX-4, pY, pTarget);
            
            
        } else{
            Weapon.aimTargetIfExists(pX, pY-1, pTarget);
            Weapon.aimTargetIfExists(pX-1, pY, pTarget);
            Weapon.aimTargetIfExists(pX, pY, pTarget);
            Weapon.aimTargetIfExists(pX+1, pY, pTarget);
            Weapon.aimTargetIfExists(pX-1, pY+1, pTarget);
            Weapon.aimTargetIfExists(pX, pY+1, pTarget);
            Weapon.aimTargetIfExists(pX+1, pY+1, pTarget);
            
            Weapon.aimTargetIfExists(pX, pY-2, pTarget);
            Weapon.aimTargetIfExists(pX-1, pY-1, pTarget);
            Weapon.aimTargetIfExists(pX-2, pY-1, pTarget);
            Weapon.aimTargetIfExists(pX-2, pY, pTarget);
            Weapon.aimTargetIfExists(pX-2, pY+1, pTarget);
            Weapon.aimTargetIfExists(pX-1, pY+2, pTarget);
            Weapon.aimTargetIfExists(pX, pY+2, pTarget);
            Weapon.aimTargetIfExists(pX+1, pY+2, pTarget);
            Weapon.aimTargetIfExists(pX+2, pY+1, pTarget);
            Weapon.aimTargetIfExists(pX+2, pY, pTarget);
            Weapon.aimTargetIfExists(pX+2, pY-1, pTarget);
            Weapon.aimTargetIfExists(pX+1, pY-1, pTarget);
            
            Weapon.aimTargetIfExists(pX+3, pY, pTarget);
            Weapon.aimTargetIfExists(pX+3, pY+1, pTarget);
            Weapon.aimTargetIfExists(pX+4, pY, pTarget);
            
            Weapon.aimTargetIfExists(pX-3, pY, pTarget);
            Weapon.aimTargetIfExists(pX-3, pY+1, pTarget);
            Weapon.aimTargetIfExists(pX-4, pY, pTarget);
        }
        return true;
    }
}

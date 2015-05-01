/* 
 * Creation : Feb 9, 2015
 * Project Computer Science L2 Semester 4 - BattleShip
 */
package com.battleship.models.game;

import com.battleship.asset.CheatCode;
import com.battleship.asset.Session;
import com.battleship.constants.GameConstants;
import com.battleship.main.DebugTrack;
import javax.swing.SwingUtilities;





/**
 * <h1>GameModel</h1>
 * <p>
 * public class GameModel<br/>
 * extends Model<br/>
 * implements GameConstants
 * </p>
 * 
 * <p>
 * This class manage the game. Game is set by a configuration which is 
 * a GameConfigModel class.
 * </p>
 *
 * @date    Feb 9, 2015
 * @author  Constantin MASSON
 * @author  Jessica FAVIN
 * @author  Anthony CHAFFOT
 */
public class GameModel extends Model implements GameConstants{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    //Runtime constants
    public      static final int    SWITCH_TURN             = 1;
    public      static final int    SWITCH_PAGE             = 2;
    
    //Variables
    private     GameConfigModel     config;
    private     final int           gridType;
    private     final int           gridWidth;
    private     final int           gridHeight;
    
    private     Player[]            listPlayers;
    private     int                 counterTurn;
    private     int                 currentPlayerTurn;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Constructor: create a new GameModel from a GameConfigModel class<br/>
     * Set the configuration from GameConfigModel. After creation, basement config 
     * could not be changed anymore (As gridWidth, gridHeight and gridType)
     * @param pConfig configuration to set
     */
    public GameModel(GameConfigModel pConfig) {
        DebugTrack.showInitMsg("Create GameModel");
        CheatCode.setData(this);
        this.config             = pConfig;
        this.gridWidth          = pConfig.getGridWidth();
        this.gridHeight         = pConfig.getGridHeight();
        this.gridType           = pConfig.getGridType();
        this.listPlayers        = pConfig.getPlayers();
        
        this.counterTurn        = 1;
        this.currentPlayerTurn  = pConfig.getFirstPlayerTurn();
        
        //Add this GameModel in every player
        for (Player p : this.listPlayers){
            p.setGameModel(this);
        }
    }
    
    
    
    
    
    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Switch turn behavior. It depend of current game mode
     * <ul>
     *  <li>Mode AI : start AI shoot</li>
     *  <li>Mode V2 : display a switching panel</li>
     *  <li>Mode LAN : do nothing, juste wait for other player shot</li>
     * </ul>
     * 
     */
    public void switchTurnBehaviors() {
        this.counterTurn++;
        switch(this.currentPlayerTurn){
            case 0:
                this.currentPlayerTurn = 1;
                break;
            default:
                this.currentPlayerTurn = 0;
                break;
        }
        
        int mode = Session.getGameMode();
        switch(mode){
            case GameConstants.MODE_AI:
                break;
            case GameConstants.MODE_V2:
                this.notifyObservers(null);
                    SwingUtilities.invokeLater(new Runnable(){
                        public void run(){
                            try {
                                Thread.sleep(GameConstants.DELAY_SWITCH_BREAK);
                                notifyObservers(GameModel.SWITCH_PAGE);
                            } catch(InterruptedException ex) {
                            }
                        }
                    });
                break;
            case GameConstants.MODE_LAN:
                break;
        }
    }
    
    
    
    
    
    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    /**
     * Return game config used by this game
     * @return 
     */
    public GameConfigModel getConfig(){
        return this.config;
    }
    
    /**
     * Return nb turn player
     * @return 
     */
    public int getNbTurn(){
        return this.counterTurn;
    }
    
    /**
     * Return id of current player turn
     * @return int id current player turn
     */
    public int getIdPlayerTurn(){
        return this.currentPlayerTurn;
    }
}

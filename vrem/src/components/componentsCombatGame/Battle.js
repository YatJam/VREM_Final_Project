import React from 'react'
import { useState } from 'react'
import { opponentStats, playerStats } from './Characters'
import './Battle.css'
import PlayerSummary from './PlayerSummary'
import BattleMenu from './BattleMenu'
import BattleAnnouncer from './BattleAnnouncer'

const Battle =() => {

const [playerHealth, setPlayerHealth] = useState(playerStats.maxHealth)  
const [opponentHealth, setOpponentHealth] = useState(opponentStats.maxHealth)
const [announcerMessage, setAnnouncerMessage] = useState('');

  return (
        <>
        <div className="battleContainer" >
            <div className="opponent">
              <div className="summary">
                <PlayerSummary main={false} 
                health={opponentHealth}
                name={opponentStats.name}
                level={opponentStats.level}
                maxHealth={opponentStats.maxHealth}/>
              </div>

            </div>

          <div className="characters">
            <div className="gameHeader">
              {playerStats.name} vs {opponentStats.name}
              </ div>

              <div className="gameImages">

                <div className="playerSprite">
                  <img src={playerStats.img} alt={playerStats.name}/>
                </div>

                <div className="opponentSprite">
                  <img src={opponentStats.img} alt={opponentStats.name}/>
                </div>

              </div>

          </div>

            <div className="user" >
              <div className="summary">
                <PlayerSummary main 
                health={playerHealth}
                name={playerStats.name}
                level={playerStats.level}
                maxHealth={playerStats.maxHealth}/>
              </div>

              <div className="hud">

                <div className="hudChild">
                  <BattleAnnouncer message={announcerMessage || `What will ${playerStats.name} do?`}/>
                </div>

                <div className="hudChild">
                  <BattleMenu onAttack={() => console.log('Attack!')} onMagic={() => console.log('Magic!')} onHeal={() => console.log('Heal!')}/>
                </div>

              </div>
          </div>
            
          
        </div>
        
        </>
  )
}

export default Battle;
import React from 'react'
import { useState } from 'react'
import { opponentStats, playerStats } from './Characters'
import './Battle.css'
import PlayerSummary from './PlayerSummary'

const Battle =() => {

const [playerHealth, setPlayerHealth] = useState(playerStats.maxHealth)  
const [opponentHealth, setOpponentHealth] = useState(opponentStats.maxHealth)

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
            <div className="user" >
              <div className="summary">
                <PlayerSummary main 
                health={playerHealth}
                name={playerStats.name}
                level={playerStats.level}
                maxHealth={playerStats.maxHealth}
                />
              </div>
            </div>
            Battle menu component
        </div>
        
        </>
  )
}

export default Battle;
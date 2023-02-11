import React, { useEffect } from 'react'
import { useState } from 'react'
import { opponentStats, playerStats } from './Characters'
// import { useBattleSequence } from './useBattleSequence'
import useBattleSequence from './useBattleSequence'
import './Battle.css'
import PlayerSummary from './PlayerSummary'
import BattleMenu from './BattleMenu'
import BattleAnnouncer from './BattleAnnouncer'
import useAIOpponent from './useAIOpponent'

const Battle =({ onGameEnd }) => {
  const [sequence, setSequence] = useState({});

const {turn, inSequence, playerHealth, opponentHealth, playerAnimation, opponentAnimation, announcerMessage} = useBattleSequence(sequence);

const aiChoice = useAIOpponent(turn);

useEffect(() => {
if(aiChoice && turn === 1 && !inSequence){
  setSequence({ turn, mode: aiChoice });
}

}, [turn, aiChoice, inSequence]);

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
                  <img className={[playerAnimation]} src={playerStats.img} alt={playerStats.name}/>
                </div>

                <div className="opponentSprite">
                  <img className={[opponentAnimation]} src={opponentStats.img} alt={opponentStats.name}/>
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
                  <BattleMenu onAttack={() => setSequence({ turn, mode: 'attack'})} onMagic={() => setSequence({ turn, mode: 'magic'})} onHeal={() => setSequence({ turn, mode: 'heal'})}/>
                </div>

              </div>
          </div>
            
          
        </div>
        
        </>
  )
}

export default Battle;
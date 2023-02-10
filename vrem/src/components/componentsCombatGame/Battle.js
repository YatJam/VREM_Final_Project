import React from 'react'
import './CombatGame.css'
import PlayerSummary from './PlayerSummary'

const Battle =() => {
  return (
        <>
        <div className="battleMain" >
            <div className="opponent">
              <div className="summary">
                <PlayerSummary main={false} />
              </div>

            </div>
            <div className="user" >
              <div className="summary">
                <PlayerSummary main />
              </div>
            </div>
            Battle menu component
        </div>
        
        </>
  )
}

export default Battle;
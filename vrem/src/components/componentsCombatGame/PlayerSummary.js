import React from 'react'
import Bar from './Bar';
import './CombatGame.css'

const red = '#821200';
const blue = '#1953cb';

const PlayerSummary = ({ main, name, level, health, maxHealth }) => {

  return (
    <>
    <div className="playerSummaryContainer" style={{ backgroundColor: main ? red : blue}}>
        Player Summary Component
        <div className="info">
            <div className="name">
                {name}
            </div>
            <div className="level">
               Lvl: {level}
            </div>

        </div>
        <div className="health">
            <Bar label="HP" value={health} maxValue={maxHealth}/>
        </div>
    </div>
    </>
  )
}

export default PlayerSummary
import React from 'react'
import { useState } from 'react';
import StartMenu from '../components/componentsCombatGame/StartMenu';
import '../components/componentsCombatGame/CombatGame.css'
import Battle from '../components/componentsCombatGame/Battle';
import EndMenu from '../components/componentsCombatGame/EndMenu';

function CombatContainer() {
    const [mode, setMode] = useState('start');
    const [winner, setWinner] = useState();

  return (
    <>
    <div className="combatWrapper">
        {mode === 'start' && (
            <StartMenu onStartClick={() => setMode('battle')}/>
            )}

        {mode === 'battle' && <Battle onGameEnd={winner => {
          setWinner(winner);
          setMode('gameOver');
        }}/>}

        {mode === 'gameOver' && <EndMenu winner={winner} onStartClick={() => {
          setWinner(undefined);
          setMode('battle');
        }}/>}
    </div>
    </>
  )
}

export default CombatContainer
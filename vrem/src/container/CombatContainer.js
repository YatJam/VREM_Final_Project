import React from 'react'
import { useState } from 'react';
import StartMenu from '../components/componentsCombatGame/StartMenu';
import '../components/componentsCombatGame/CombatGame.css'
import Battle from '../components/componentsCombatGame/Battle';

function CombatContainer() {
    const [mode, setMode] = useState('start');

  return (
    <>
    <div className="combatWrapper">
        {mode === 'start' && (
            <StartMenu onStartClick={() => setMode('battle')}/>
            )}

        {mode === 'battle' && <Battle/>}

        {mode === 'gameOver' && <>Game Over</>}
    </div>
    </>
  )
}

export default CombatContainer
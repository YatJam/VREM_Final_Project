import React from 'react'
import './CombatGame.css'



const StartMenu = ({ onStartClick }) => {

  return (
    <>
    <div className="startMain">
        <button className="startButton" onClick={onStartClick}>
            Start Game
            </button>
    </div>
    </>
   
  )
};

export default StartMenu
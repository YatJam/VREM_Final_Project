import React from 'react'
import './StartMenu.css'



const StartMenu = ({ onStartClick }) => {

  return (
    <>
    <div className="startContainer">
        <button className="startButton" onClick={onStartClick}>
            Start Game
            </button>
    </div>
    </>
   
  )
};

export default StartMenu
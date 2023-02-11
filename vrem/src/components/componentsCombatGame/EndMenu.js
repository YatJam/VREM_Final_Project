import React from 'react'
import './EndMenu.css'

const EndMenu = ({ winner, onStartClick }) => {

  return (
    <>
    <div className="endMenuContainer">
        <h1>{winner.name} has won!</h1>
        <button className="startButton" onClick={onStartClick}>Play Again</button>
    </div>
    
    </>
  )
}

export default EndMenu
import React, { useEffect, useState } from 'react'
import { opponentStats, playerStats } from './Characters'
import './EndMenu.css'

const EndMenu = ({ winner, onStartClick }) => {

const [endMessage, setEndMessage] = useState('')
const [returnToGame, setReturnToGame] = useState(false);
const [gameover, setGameOver] = useState(false);

useEffect(() => {
  if (winner === playerStats){
    setEndMessage("The Player has won")
    setReturnToGame(true)
    } else {
    setEndMessage("The Opponent Won")
    setGameOver(true)
    }
})


  return (
    <>
    <div className="endMenuContainer">
        <h2 className="battleOutcome">{winner.name} has won!</h2>
        <h3 className="endMessage">{endMessage}</h3>
        {/* <button className="startButton" onClick={onStartClick}>Play Again</button> */}
        {returnToGame && <button className="startButton">return to game</button>}
        {gameover && <button className="startButton">game over</button>}
    </div>
    
    </>
  )
}

export default EndMenu
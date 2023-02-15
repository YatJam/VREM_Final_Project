import React, { useEffect, useState } from 'react'
import { opponentStats, playerStats } from './Characters'
import { Link } from 'react-router-dom';
import './EndMenu.css'

const EndMenu = ({ winner, onStartClick }) => {

const [endMessage, setEndMessage] = useState('')
const [returnToGame, setReturnToGame] = useState(false);
const [gameover, setGameOver] = useState(false);
const [youWon, setYouWon] = useState(false);
const [youDead, setYouDead] = useState(false);

useEffect(() => {
  if (winner === playerStats){
    setEndMessage("You have been victorious in the fight against the dark...for now.")
    setYouWon(true)
    setReturnToGame(true)
    } else {
    setEndMessage("Fear not, your soul and body have been bound to the dark legions! The light will seek a new champion.")
    setYouDead(true)
    setGameOver(true)
    }
})


  return (
    <>
    <div className="endmenuwrapper">
      <img className="endangelleft" src='./assets/angelleft.png' />
    <div className="endMenuContainer">
        {youWon && <h2 className="battleOutcome">{winner.name} has won the skirmish!</h2>}
        {youDead && <h2 className="youaredead">YOU ARE DEAD</h2>}
        <h3 className="endMessage">{endMessage}</h3>
        <Link to="/game">
        {returnToGame && <button className="returnToButton">return to game</button>}
        </Link>
        <Link to='/'>
        {gameover && <button className="gameOverButton">game over</button>}{' '}
        </ Link>
    </div>
    <img className="endangelright" src='./assets/angelright.png' />
    </div>
    </>
  )
}

export default EndMenu
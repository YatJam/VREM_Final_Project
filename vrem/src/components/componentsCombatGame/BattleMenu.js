import React from 'react'
import './BattleMenu.css'

const BattleMenu =({ onAttack, onMagic, onHeal }) => {

  return (
    <>
    <div className="battleMenuContainer">
        <div className="options" onClick={onAttack}>Attack</div>
        <div className="options" onClick={onMagic}>Magic</div>
        <div className="options" onClick={onHeal}>Heal</div>



    </div>
    
    </>
  )
}

export default BattleMenu
import React from 'react'
import './CombatGame.css'

const Bar = ({ label, value, maxValue }) => {

  return (
    <>
    <div className="barContainer">
        <div className="barLabel">
            {label}
        </div>
        <div className="barMax">

        </div>
        <div className="barValue" style={{ width: `${(value / maxValue) * 100}%`}}>

        </div>
    </div>
    </>
    
  )
}

export default Bar
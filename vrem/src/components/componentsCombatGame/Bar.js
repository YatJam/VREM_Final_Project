import React from 'react'
import './Bar.css'

const Bar = ({ value, maxValue, label }) => {

  return (
    <>
    <div className="barContainer">
        <div className="label">
            {label}
        </div>
        <div className="max">
          <div className="value" style={{width: `${(value / maxValue) * 100}%` }}></div>
        </div>
    </div>
    </>
    
  )
}

export default Bar
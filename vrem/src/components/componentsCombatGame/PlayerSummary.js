import React from 'react'

const red = '#821200';
const blue = '#1953cb';

const PlayerSummary = ({ main }) => {

  return (
    <>
    <div className="playerSummaryContainer" style={{ backgroundColor: main ? red : blue}}>
        Player Summary Component
    </div>
    </>
  )
}

export default PlayerSummary
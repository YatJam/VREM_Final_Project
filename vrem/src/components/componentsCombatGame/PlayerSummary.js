import Bar from './Bar'
import './PlayerSummary.css'

const red = '#821400';
const blue = '#1953cb';

const PlayerSummary = ({ main, name, level, health, maxHealth,}) => {
  
  return (
    <>
    <div
      className="playerSummaryContainer"
      style={{ backgroundColor: main ? red : blue }}>
      <div className="info">
        <div className="name">{name}</div>
        <div className="level">Lvl {level}</div>
      </div>

      <div className="health">
        <Bar label="HP" value={health} maxValue={maxHealth} />
      </div>
    </div>
  </>
  )
  };
export default PlayerSummary
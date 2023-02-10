import React from 'react'
import './BattleAnnouncer.css'
import useTypedMessage from './useTypedMessage';

const BattleAnnouncer = ({ message }) => {

    const typedMessage = useTypedMessage(message);

  return (
    <>
    <div className="battleAnnouncerContainer">

        <div className="message">
            {typedMessage}
        </div>


    </div>
    </>
   
  )
}

export default BattleAnnouncer
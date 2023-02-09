import React from 'react'
import EventService from '../service/EventService'
import { useState, useEffect } from 'react';
import TextGame from '../components/componentsTextGame/TextGame';

function GameContainer() {
    const [allEvents, setAllEvents] = useState([]);

    useEffect(() => {
        EventService.getEvents().then((events) => setAllEvents(events));
    }, []);
  return (
    <>
     <TextGame events={allEvents}/>
    </>

  )
}

export default GameContainer
import React from 'react'
import EventService from '../service/EventService'

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
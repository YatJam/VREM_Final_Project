import React from 'react';
import Navigator from '../components/Navigator'
import TextGame from '../components/componentsTextGame/TextGame';
import styled from 'styled-components';
import EventService from '../service/EventService'
import { Link } from 'react-router-dom';
import { useState, useEffect } from 'react';

const HomeContainer = () => {
    const [allEvents, setAllEvents] = useState([]);

    useEffect(() => {
        EventService.getEvents().then((events) => setAllEvents(events));
    }, []);
    

    const HomePageWrapper = styled.div`
        display: flex;
        justify-content: center;
        width: 100%;
        height: 100%;
        gap: 1rem;
    `;

    return (
        <main>
            <Navigator />
            <HomePageWrapper>
                <TextGame events={allEvents}/>
            </HomePageWrapper>
        </main>
    );
};

export default HomeContainer;

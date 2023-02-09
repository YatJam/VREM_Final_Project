import React from 'react';
import Navigator from '../components/Navigator'
import TextGame from '../components/componentsTextGame/TextGame';
import styled from 'styled-components';
import { Link } from 'react-router-dom';
import { useState, useEffect } from 'react';
import NewPlayerModal from '../components/componentsTextGame/NewPlayerModal';

const HomeContainer = () => {

    const [openModal, setOpenModal] = useState(false)
   

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
                <div className="startGameWrapper">
                    <h1>Lets start a new game</h1>
                    <button className="openModalBtn" onClick={() => setOpenModal(true)}>Start Game</button>
                    {openModal && <NewPlayerModal closeModal={setOpenModal}/>}
                </div>
            </HomePageWrapper>
        </main>
    );
};

export default HomeContainer;

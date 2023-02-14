import React from 'react';
import Navigator from '../components/Navigator'
import TextGame from '../components/componentsTextGame/TextGame';
import styled from 'styled-components';
import { Link } from 'react-router-dom';
import { useState, useEffect } from 'react';
import NewPlayerModal from '../components/componentsTextGame/NewPlayerModal';
import './HomeContainer.css'

const HomeContainer = () => {

    const [openModal, setOpenModal] = useState(false)

    return (
        <main>
            <Navigator />
            <div className="mainScreenContainer">
                <div className="welcomeContainer">
                    <h2 className="welcomeT">Welcome stranger</h2>
                    <p className="welcomeP">Vrem (Dwarvish word for sorrow) is a choose your own adventure style game with a turn based combat mechanic.</p>
                    <p className="welcomeP">Is your soul robust enough to rid the world of darkness and reach salvation?</p>
                    <h1 className="startgametitle">Is your soul ready?</h1>
                    <button className="openModalBtn" onClick={() => setOpenModal(true)}>Start Game</button>
                    {openModal && <NewPlayerModal closeModal={setOpenModal}/>}
                </div>
                <div>
                    <Link to="/combat">
                    <button>combat</button>{' '}
                    </Link>
                </div>
            </div>
        </main>
    );
};

export default HomeContainer;

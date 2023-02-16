import React from 'react';
import './Nav.css';

const Characters = () => {
    return (
        <>
        <div className="AboutWrapper">
            <div className="AboutContainer">

            <h1 className="navHeader">CHARACTERS</h1>
                <p>There are many characters that dwell within the world of VREM. There are several playable characters as follows:</p>
                <ul>
                    <li>Amazon: a female warrior from the forgotten lands.</li>
                    <li>Dwarf: a feirce warrior and formiddable smith. Struggle to trust non dwarf races.</li>
                    <li>Outcast: A champion fallen from grace and cast out of their society.</li>
                    <li>Paladin: A virtuous hero, blessed by the Light and will follow the divine path.</li>
                    <li>Warlock: One that is blessed with magic but also enjoys violence.</li>
                </ul>

            </div>
        </div>
        </>
    );
};

export default Characters;
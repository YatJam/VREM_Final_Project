import { React, useEffect, useState } from "react";
import Player from '../../image/demoKnight.png';
import Scene from '../../image/demoScene.png'
import './TextGame.css'

const TextGame = ({events}) => {

    return (
        <body>
            <h1>This is the main containerz</h1>
        <div className="gameScreenWrapper">
            <div className="playerImageAndStatsContainer">
                <div className="playerImageContainer">
                    <img className="playerImage" src={Player} alt='placeholderKnight' />
                </div>
                <div className="playerStatsContainer">
                    player stats here
                </div>
            </div>
            <div className="textGameContainer">
                <div className="eventImageContainer">
                    <img className="sceneImage" src={Scene} alt='placeholderIamge'/>
                </div>
                <div className="textContainer">
                    <p>{events[0].eventStory}</p>
                </div>
                <div className="buttonContainer" id="btn-grid">
                    <button className="optionButtons" >{events[0].choices[0].choiceType}</button>
                    <button className="optionButtons" >{events[0].choices[1].choiceType}</button>
                    <button className="optionButtons" >{events[0].choices[2].choiceType}</button>
                    <button className="optionButtons" >{events[0].choices[3].choiceType}</button>
                </div>
            </div>
            <div className="actionButtonContainer">
                <button className="inventoryButton">Inventory Button</button>
                <button className="equipmentButton">Equipment Button</button>
            </div>
            </div>    
        </body>
    )
}
export default TextGame;
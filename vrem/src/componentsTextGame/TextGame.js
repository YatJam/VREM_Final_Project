import { React, useEffect, useState } from "react";
import Player from '../image/demoKnight.png';
import Scene from '../image/demoScene.png'
import './TextGame.css'

const TextGame = () => {

    return (
        <body>
            <h1>This is the main containerz</h1>
        <div className="gameScreenWrapper">
            <div className="playerImageAndStatsContainer">
                <div className="playerImageContainer">
                    <img className="playerImage" src={Player} alt='placeholderKnight' />
                </div>
                <div className="playerStatsContainer">
                    This is the player stats container
                </div>
            </div>
            <div className="textGameContainer">
                <div className="eventImageContainer">
                    <img className="sceneImage" src={Scene} alt='placeholderIamge'/>
                </div>
                <div className="textContainer">
                    This is the event text container
                </div>
                <div className="buttonContainer" id="btn-grid">
                    <button className="optionButtons" >option1</button>
                    <button className="optionButtons" >option2</button>
                    <button className="optionButtons" >option3</button>
                    <button className="optionButtons" >option4</button>
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
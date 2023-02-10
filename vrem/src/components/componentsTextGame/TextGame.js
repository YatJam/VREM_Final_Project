import { React, useEffect, useState } from "react";
import InventoryModal from "./InventoryModal";
import EquipmentModal from "./EquipmentModal";
import Player from '../../image/demoKnight.png';
import Scene from '../../image/demoScene.png'
import './TextGame.css'

const TextGame = ({events}) => {
    const [openInventory, setOpenInventory] = useState(false)
    const [openEquipment, setOpenEquipment] = useState(false)

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
                    <p>{events[0] ? events[0].eventStory : null}</p>
                </div>
                <div className="buttonContainer" id="btn-grid">
                    <button className="optionButtons" >{events[0] ? events[0].choices[0].choiceType : null}</button>
                    <button className="optionButtons" >{events[0] ? events[0].choices[1].choiceType : null}</button>
                    <button className="optionButtons" >{events[0] ? events[0].choices[2].choiceType : null}</button>
                    <button className="optionButtons" >{events[0] ? events[0].choices[3].choiceType : null}</button>
                </div>
            </div>
            <div className="actionButtonContainer">
                <button className="openModalBtn" onClick={() => setOpenInventory(true)}>Inventory</button>
                    {openInventory && <InventoryModal closeModal={setOpenInventory}/>}
                <button className="openModalBtn" onClick={() => setOpenEquipment(true)}>Equipment</button>
                    {openEquipment && <EquipmentModal closeModal={setOpenEquipment}/>}
            </div>
            </div>    
        </body>
    )
}
export default TextGame;
import { React, useContext, useEffect, useState } from "react";
import InventoryModal from "./InventoryModal";
import EquipmentModal from "./EquipmentModal";
import Scene from '../../image/demoScene.png'
import './TextGame.css'
import { ArmourContext, PlayerContext, WeaponContext } from "../../Helper/useContext";

const TextGame = ({events }) => {
    const [openInventory, setOpenInventory] = useState(false);
    const [openEquipment, setOpenEquipment] = useState(false);
    const [eventId, setEventId] = useState(0);
    const { player } = useContext(PlayerContext);
    const { weapon } = useContext(WeaponContext);
    const { armour } = useContext(ArmourContext);
    

    const handleEventChange = (exitId) => {
        console.log(exitId)
        setEventId(exitId)
        console.log(eventId)
    };


    return (
        <body>
        <div className="gameScreenWrapper">
            <div className="playerImageAndStatsContainer">
                <div className="playerName">
                <img className="picon" src='../assets/picon.png' alt='picon'/>
                 layer Name: {player.name}</div>
                
                <div className="CharacterName">
                    <img className="icon" src='../assets/charactericon.png' alt='charactericon'/>
                    Character: {player.class}
                    </div>

                <div className="playerImageContainer">
                    <img className="playerImage" src='../assets/placeholderknight.png' alt='placeholderKnight' />
                </div>
                
                <div className="playerStatsContainer">
                    <div className="PlayerHealth">
                    <img className="icon" src='../assets/healthicon.png' alt='healthicon'/>  
                        Player Health: {player.health}  </div>
                    <div className="weaponandarmourcontainer">
                        <div className="weapon">
                        <img className="icon" src={weapon.icon} alt='damageicon'/>
                            Weapon: {weapon.name} 
                        </div>
                        <div className="weaponDamage">
                        <img className="icon" src='../assets/damageicon.png' alt='damageicon'/>
                        Damage: {weapon.damage}  </div>
                        <div className="armour">
                        <img className="icon" src='../assets/armouricon.png' alt='damageicon'/>  
                            Armour: {armour.name}</div>
                    </div>

                </div>
            </div>
            <div className="textGameContainer">
                <div className="eventImageContainer">
                    <img className="sceneImage" src={Scene} alt='placeholderIamge'/>
                </div>
                <div className="textContainer">
                    <p>{events[eventId]?.eventStory}</p>
                </div>
                <div className="buttonContainer" id="btn-grid">
                    <button className="optionButtons" onClick={() => handleEventChange(events[eventId]?.choices[0].exitId)} >{events[eventId]?.choices[0].choiceType}</button>
                    <button className="optionButtons" onClick={() => handleEventChange(events[eventId]?.choices[1].exitId)}>{events[eventId]?.choices[1].choiceType}</button>
                    <button className="optionButtons" onClick={() => handleEventChange(events[eventId]?.choices[2].exitId)}>{events[eventId]?.choices[2].choiceType}</button>
                    <button className="optionButtons" onClick={() => handleEventChange(events[eventId]?.choices[3].exitId)}>{events[eventId]?.choices[3].choiceType}</button>
                </div>
            </div>
            <div className="actionButtonContainer">
                <button className="openInventorylBtn" onClick={() => setOpenInventory(true)}>Inventory</button>
                    {openInventory && <InventoryModal closeModal={setOpenInventory}/>}
                <button className="openEquipmentlBtn" onClick={() => setOpenEquipment(true)}>Equipment</button>
                    {openEquipment && <EquipmentModal closeModal={setOpenEquipment}/>}
            </div>
            </div>    
        </body>
    )
}
export default TextGame;
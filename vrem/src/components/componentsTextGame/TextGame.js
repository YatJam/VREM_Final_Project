import { React, useContext, useEffect, useState } from "react";
import InventoryModal from "./InventoryModal";
import EquipmentModal from "./EquipmentModal";
import WeaponService from "../../service/WeaponService";
import NewPlayerModal from "./NewPlayerModal";
import Player from '../../image/demoKnight.png';
import Scene from '../../image/demoScene.png'
import './TextGame.css'
import { ClassContext, PlayerContext } from "../../Helper/useContext";

const TextGame = ({events }) => {
    const [openInventory, setOpenInventory] = useState(false)
    const [openEquipment, setOpenEquipment] = useState(false)
    const { playerName } = useContext(PlayerContext);
    const character = useContext(ClassContext);

    // const [weapon, setWeapon] = useState([])
    // const [armour, setArmour] = useState([])
    // const [playerHealth, setplayerHealth] = useState(0)

    // useEffect(() => {
    //       const weaponList = ['sword', 'axe', 'hammer'];
    //       setWeapon(weaponList[Math.floor(Math.random() * weaponList.length)]);
        
    //   }, []);

    //   useEffect(() => {
    //     WeaponService.getWeapons([1]).then((weapons) => setWeapon(weapons));
    // }, []);

    // useEffect(() => {
    //     const minHealth = 100;
    //     const maxHealth = 160;
    //     setplayerHealth(minHealth + (Math.floor(Math.random() * (maxHealth - minHealth))));
      
    // }, []);

    return (
        <body>
            <h1>This is the main containerz</h1>
        <div className="gameScreenWrapper">
            <div className="playerImageAndStatsContainer">
                <div className="playerName">Player Name: {playerName}</div>
                <div className="CharacterName">Character: {character}</div>
                <div className="playerImageContainer">
                    <img className="playerImage" src='../assets/placeholderknight.png' alt='placeholderKnight' />
                </div>
                <div className="playerStatsContainer">
                    <div className="PlayerHealth">Player Health:  </div>
                    <div className="weaponandarmourcontainer">
                        <div className="weapon">Weapon:  </div>
                        <div className="armour">Armour: </div>
                    </div>

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
                    <button className="optionButtons" >{events[0]?.choices[0].choiceType}</button>
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
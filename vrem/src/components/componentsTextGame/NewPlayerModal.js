import React from 'react'
import ReactDom from 'react-dom'
import { Link } from 'react-router-dom';
import { useState, useEffect } from 'react';
import './NewPlayerModal.css'
import UserService from '../../service/UserService';

function NewPlayerModal({ closeModal }) {
    const [playerName, setPlayerName] = useState("")
    const [characterClass, setCharacterClass] = useState("")
    const [weapon, setWeapon] = useState([])
    const [armour, setArmour] = useState([])
    const [playerHealth, setplayerHealth] = useState(0)

    useEffect(() => {
          const weaponList = ['sword', 'axe', 'hammer'];
          setWeapon(weaponList[Math.floor(Math.random() * weaponList.length)]);
        
      }, []);

    useEffect(() => {
        const armourList = ['cloth', 'leather', 'mail'];
        setArmour(armourList[Math.floor(Math.random() * armourList.length)]);
      
    }, []);

    useEffect(() => {
        const minHealth = 100;
        const maxHealth = 160;
        setplayerHealth(minHealth + (Math.floor(Math.random() * (maxHealth - minHealth))));
      
    }, []);

  
    const handlePlayerNameChange = (event) => {
        setPlayerName(event.target.value);
      }

    const onOptionChange = (event) => {
        setCharacterClass(event.target.value)
      }

    const handleSubmit = (event) => {
        event.preventDefault();
        console.log(playerName)
        console.log(characterClass)
    }
    


  return ReactDom.createPortal(
    <div className="modalBackground">
        <div className="modalContainer">
            <div className="titleCloseBtn">
            <button onClick={() => closeModal(false)}> X </button>
            </div>
            <div className="title">
                <h1>Create your player</h1>
            </div>
            <div className="body">
                <p>Insert your player details.</p>
                <form className="createPlayerForm" onSubmit={handleSubmit}>
                    <div>
                    <label htmlFor='name'>Player Name</label>
                    <input
                        type="text"
                        value={playerName}
                        placeholder="Player Name"
                        onChange={handlePlayerNameChange}/>
                    </div>
                    <div>
                    <input
                        type="radio"
                        name="character"
                        value="Amazon"
                        id="Amazon"
                        checked={characterClass === "Amazon"}
                        onChange={onOptionChange}
                    />
                    <label htmlFor="amazon">Amazon</label>

                    <input
                        type="radio"
                        name="character"
                        value="Dwarf"
                        id="Dwarf"
                        checked={characterClass === "Dwarf"}
                        onChange={onOptionChange}
                    />
                    <label htmlFor="dwarf">Dwarf</label>

                    <input
                        type="radio"
                        name="character"
                        value="Outcast"
                        id="Outcast"
                        checked={characterClass === "Outcast"}
                        onChange={onOptionChange}
                    />
                    <label htmlFor="outcast">Outcast</label>

                    <input
                        type="radio"
                        name="character"
                        value="Paladin"
                        id="Paladin"
                        checked={characterClass === "Paladin"}
                        onChange={onOptionChange}
                    />
                    <label htmlFor="paladin">Paladin</label>

                    <input
                        type="radio"
                        name="character"
                        value="Warlock"
                        id="Warlock"
                        checked={characterClass === "Warlock"}
                        onChange={onOptionChange}
                    />
                    <label htmlFor="warlock">Warlock</label>

                    <p>
                        Select character <strong>{characterClass}</strong>
                    </p>
                    </div>
                    <div>
                        <label htmlFor='terms'>Terms of service</label>
                        <input type="checkbox" name="terms" value="checked" />
                    </div>
                    <Link to='/game'>
                    <button className="createPlayerbtn" type="submit" >Create Player</button>{' '}
                    </Link>
                </form>
            </div>
            <div className="footer">
                <button onClick={() => closeModal(false)} id="cancelBtn">Cancel</button>
                
            </div>

        </div>
    </div>,
    document.getElementById('portal')
  )
}

export default NewPlayerModal;
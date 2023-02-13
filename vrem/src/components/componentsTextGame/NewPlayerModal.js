import React from 'react'
import ReactDom from 'react-dom'
import { Link } from 'react-router-dom';
import { useState, useContext, useEffect } from 'react';
import './NewPlayerModal.css'
import { PlayerContext, WeaponContext, ArmourContext } from '../../Helper/useContext';

function NewPlayerModal({ closeModal }) {
    const [characterClass, setCharacterClass] = useState([])
    const [createName, setCreateName] = useState('');
    const [weaponStart, setWeaponStart] = useState({});
    const [armourStart, setArmourStart] = useState([]);
    const [playerHealth, setPlayerHealth] = useState(0);
    const { setPlayer } = useContext(PlayerContext);
    const { setArmour } = useContext(ArmourContext);
    const { setWeapon } = useContext(WeaponContext);
    const [playerBuild, setPlayerBuild] = useState({name: null, class: null, health: 0})

    useEffect(() => {
              const weaponList = [{name: "short sword", damage: 40, icon: '../assets/swordicon.png'}, 
              {name: "axe", damage: 60, icon: '../assets/axeicon.png'}, 
              {name: "warhammer" , damage: 70, icon: '../assets/hammericon.png'}, 
              {name: "spear", damage: 55, icon: '../assets/spearicon.png'}, 
              {name: "mace", damage: 50, icon: '../assets/maceicon.png'}];
              setWeaponStart(weaponList[Math.floor(Math.random() * weaponList.length)]);
            
          }, []);


    useEffect(() => {
            const armourList = [{name: "leather", defence: 15}, 
            {name: "chain mail", defence: 20}, 
            {name: "rags" , defence: 5}, 
            {name: "padded", defence: 10}];
            setArmourStart(armourList[Math.floor(Math.random() * armourList.length)]);
          
        }, []);

    useEffect(() => {
                const minHealth = 100;
                const maxHealth = 160;
                setPlayerHealth(minHealth + (Math.floor(Math.random() * (maxHealth - minHealth))));
              
            }, []);

  
    const handlePlayerNameChange = (event) => {
        setCreateName(event.target.value);
        
      }

    const onOptionChange = (event) => {
        setCharacterClass(event.target.value)
      }

    const handleSubmit = (event) => {
        event.preventDefault();
        setCreateName("");
        setCharacterClass("");
        playerBuild.name = createName;
        playerBuild.class = characterClass;
        playerBuild.health = playerHealth;
        
        setPlayerBuild(playerBuild)
        setPlayer(playerBuild);
        setArmour(armourStart);
        setWeapon(weaponStart);

        
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
                        value={createName}
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
                   
                    {/* <Link to='/game'> */}
                    <button className="createPlayerbtn" type="submit">Create Player</button>{' '}
                    {/* </Link> */}
                   
                </form>
            </div>
            <div className="footer">
                <button onClick={() => closeModal(false)} id="cancelBtn">Cancel</button>
                
                <Link to='/game'>
                <button className="createPlayerbtn" type="submit">Create Player</button>{' '}
                    </Link>
            </div>

        </div>
    </div>,
    document.getElementById('portal')
  )
}

export default NewPlayerModal;
import React from 'react'
import ReactDom from 'react-dom'
import { Link } from 'react-router-dom';
import { useState } from 'react';
import './NewPlayerModal.css'

function NewPlayerModal({ closeModal }) {
    const [playerName, setPlayerName] = useState("")
    const [characterClass, setCharacterClass] = useState("Amazon")
    const [armour, setArmour] = useState("rags")
    const [weapon, setWeapon] = useState("bareHands")

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
          let res = await fetch("http://localhost:8080/users/", {
            method: "POST",
            body: JSON.stringify({
              playerName: playerName,
              characterClass: characterClass,
              armour: armour,
              weapon: weapon,
            }),
          });
          const resJson = await res.json();
          if (res.status === 200) {
            setPlayerName("");
            setCharacterClass("");
            setArmour("");
            setWeapon("");
            setMessage("User created successfully");
          } else {
            setMessage("Some error occured");
          }
        } catch (err) {
          console.log(err);
        }
      };

  const onOptionChange = e => {
    setCharacter(e.target.value)
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
                        onChange={(e) => setPlayerName(e.target.value)} />
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

                </form>
            </div>
            <div className="footer">
                <button onClick={() => closeModal(false)} id="cancelBtn">Cancel</button>
                <Link to='/game'>
                <button type="submit">create player</button>{' '}
                </Link>
                <div className="message">{message ? <p>{message}</p> : null}</div>
            </div>

        </div>
    </div>,
    document.getElementById('portal')
  )
}

export default NewPlayerModal
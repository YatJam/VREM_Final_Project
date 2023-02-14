import React, { useState, useContext, useEffect } from 'react'
import ReactDom from 'react-dom'
import './NewPlayerModal.css'
import { PlayerContext } from "../../Helper/useContext";

function EquipmentModal({ closeModal }) {
    const { player } = useContext(PlayerContext);

    const equipmentItems = player.equipment.map((equipmentItem) => {
        return <li className="equipmentItem">
            {equipmentItem.name}{equipmentItem.damage}{equipmentItem.defence}
            <button className="equip" onclick={() => handleEquipEvent}>equip</button>
            <button className="drop" onclick={() => handleDropEvent}>drop</button>
            </li>
    }) 

  return ReactDom.createPortal(
    <div className="modalBackground">
        <div className="modalContainer">
            <div className="titleCloseBtn">
            <button onClick={() => closeModal(false)}> X </button>
            </div>
            <div className="title">
                <h1>Player Equipment</h1>
            </div>
            <div className="body">
                <ul className="equipmentList"> 
                    {equipmentItems}
                </ul>
               
            </div>
            <div className="footer">
                <button onClick={() => closeModal(false)} id="cancelBtn">Close Equipment List</button>
            </div>

        </div>
    </div>,
    document.getElementById('portal')
  )
}

export default EquipmentModal
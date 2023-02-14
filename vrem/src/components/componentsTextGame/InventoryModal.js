import React, { useContext } from 'react'
import ReactDom from 'react-dom'
import './NewPlayerModal.css'
import { PlayerContext } from "../../Helper/useContext";

function InventoryModal({ closeModal }) {
    const { player } = useContext(PlayerContext);


    const inventoryItems = player.inventory.map((inventoryItem) => {
        return <li className="inventoryItem">
            Item: {inventoryItem.name}, Value:{inventoryItem.value}
            </li>
    }) 

  return ReactDom.createPortal(
    <div className="modalBackground">
        <div className="modalContainer">
            <div className="titleCloseBtn">
            <button onClick={() => closeModal(false)}> X </button>
            </div>
            <div className="title">
                <h1>Player Inventory</h1>
            </div>
            <div className="body">
                <ul className="iventoryList">
                    {inventoryItems}
                </ul>
               
            </div>
            <div className="footer">
                <button onClick={() => closeModal(false)} id="cancelBtn">Close Inventory</button>
            </div>

        </div>
    </div>,
    document.getElementById('portal')
  )
}

export default InventoryModal
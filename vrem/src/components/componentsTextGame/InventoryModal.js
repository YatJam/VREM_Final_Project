import React, { useContext } from 'react'
import ReactDom from 'react-dom'
import './inventoryModal.css'
import { PlayerContext } from "../../Helper/useContext";

function InventoryModal({ closeModal }) {
    const { player } = useContext(PlayerContext);


    const inventoryItems = player.inventory.map((inventoryItem) => {
        return <li className="inventoryItem">
            {inventoryItem.name}{inventoryItem.value}
            </li>
    }) 

  return ReactDom.createPortal(
    <div className="inventoryBackground">
        <div className="inventoryContainer">
            <div className="titleCloseBtn">
            <button onClick={() => closeModal(false)}> X </button>
            </div>
            <div className="inventorytitle">
                <h1 className="inventorytitle">Player Inventory</h1>
            </div>
            <div className="inventorybody">
                <div className="tableheaders">
                    <h3>Item</h3>
                    <h3>Value</h3>
                    </div>
                <ul className="iventoryList">
                    {inventoryItems}
                </ul>
               
            </div>
            <div className="footerInventory">
                <button className="inventoryclosebutton" onClick={() => closeModal(false)} id="closeInventory">Close Inventory</button>
            </div>

        </div>
    </div>,
    document.getElementById('portal')
  )
}

export default InventoryModal
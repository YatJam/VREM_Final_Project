import React from 'react'
import ReactDom from 'react-dom'
import './NewPlayerModal.css'

function InventoryModal({ closeModal }) {


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
                <p>Insert Inventory list</p>
               
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
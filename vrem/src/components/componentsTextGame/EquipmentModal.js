import React from 'react'
import ReactDom from 'react-dom'
import './NewPlayerModal.css'

function EquipmentModal({ closeModal }) {


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
                <p>Insert Equipment list</p>
               
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
import React, { useState, useContext } from 'react'
import ReactDom from 'react-dom'
import { Link } from 'react-router-dom'
import './YourDead.css'

function EquipmentModal({ closeModal }) {


  return ReactDom.createPortal(
    <div className="deadBackground">
        <div className="deadContainer">
            <div className="deadTitle">
                <h1 className="deadTitle">YOU ARE DEAD</h1>
            </div>
            <div className="deadBody">
                <p>You made poor decisions and now the Light will seek a new champion.</p>
                <p>You will be forgotten.</p>
               
            </div>
            <div className="deadfooter">
                <Link to='/'>
                <button className="deadclosebutton" onClick={() => closeModal(false)} id="cancelBtn">GAME OVER</button>{' '}
                </Link>
            </div>

        </div>
    </div>,
    document.getElementById('portal')
  )
}

export default EquipmentModal
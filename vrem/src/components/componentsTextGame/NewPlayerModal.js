import React from 'react'
import ReactDom from 'react-dom'
import './NewPlayerModal.css'

function NewPlayerModal({ closeModal }) {

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
            </div>
            <div className="footer">
                <button onClick={() => closeModal(false)} id="cancelBtn">Cancel</button>
                <button>create player</button>
            </div>

        </div>
    </div>,
    document.getElementById('portal')
  )
}

export default NewPlayerModal
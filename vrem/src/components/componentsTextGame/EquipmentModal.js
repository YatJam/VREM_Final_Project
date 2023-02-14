import React, { useState, useContext } from 'react'
import ReactDom from 'react-dom'
import './EquipmentModal.css'
import { PlayerContext, WeaponContext, ArmourContext } from "../../Helper/useContext";

function EquipmentModal({ closeModal }) {
    const { player } = useContext(PlayerContext);
    const { setWeapon } = useContext(WeaponContext);
    const { setArmour } = useContext(ArmourContext);

    const handleEquipWeapon = ((equipmentItem) => {
        setWeapon(equipmentItem)
    })

    const handleEquipArmour = ((equipmentItem) => {
        setArmour(equipmentItem)
    })

    const equipmentItems = player.equipment.map((equipmentItem) => {
        return <li className="equipmentItem">
            Equipment Name: {equipmentItem.name}, 
            Equipment Damage/Defence: {equipmentItem.damage}{equipmentItem.defence}
            <button className="equip" onClick={() => equipmentItem.damage ? handleEquipWeapon(equipmentItem) : handleEquipArmour(equipmentItem)} >equip</button>
            <button className="drop" onClick={() => handleDropWeapon(equipmentItem)}>drop</button>
            </li>
    }) 

    // const equipmentArmour = player.equipment.map((equipmentArmour) => {
    //     return <li className="equipmentItem">
    //         Equipment Name: {equipmentArmour.name}
    //         Equipment Damage/Defence: {equipmentArmour.defence}
    //         <button className="equip" >equip</button>
    //         <button className="drop" >drop</button>
    //         </li>
    // })

    const handleDropWeapon = ((equipmentWeapon) => {
        player.equipment.pop(equipmentWeapon)
    })

  return ReactDom.createPortal(
    <div className="equipmentBackground">
        <div className="equipmentContainer">
            <div className="equipmentCloseBtn">
            <button onClick={() => closeModal(false)}> X </button>
            </div>
            <div className="equipmentTitle">
                <h1 className="equipmentTitle">Player Equipment</h1>
            </div>
            <div className="equipmentbody">
                <ul className="equipmentList"> 
                    {equipmentItems}
                    {/* {equipmentArmour} */}
                </ul>
               
            </div>
            <div className="equipmentfooter">
                <button className="equipmentclosebutton" onClick={() => closeModal(false)} id="cancelBtn">Close Equipment List</button>
            </div>

        </div>
    </div>,
    document.getElementById('portal')
  )
}

export default EquipmentModal
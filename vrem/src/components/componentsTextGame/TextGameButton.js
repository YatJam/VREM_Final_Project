import React from 'react'
import styled from 'styled-components'

function TextGameButton({events}) {

const ChoiceButton = styled.button`
.optionButtons{
    background-color: hsl(200, 100%, 50%);
    border: 1px solid hsl(200, 100%, 30%);
    border-radius: 5px;
    padding: 5px 10px;
    color: white;
    outline: none;
}

.optionButtons:hover {
    border-color: black;
    cursor: pointer;
}
`

  return (

    <ChoiceButton className="optionButton">{events.choices.choiceType}</ChoiceButton>
  )
}

export default TextGameButton
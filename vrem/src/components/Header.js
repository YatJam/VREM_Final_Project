import React from "react";
import styled from "styled-components";

const Header = () =>{

    const Title = styled.h1`
    display: flex;
    justify-content: center;
    padding: 50px;
    margin: 50px;
    text-align: center;
    `

    return (
        <header>
            <Title>VREM</Title>
        </header>
    )
}
export default Header;


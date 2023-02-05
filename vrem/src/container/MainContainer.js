import React from "react";
import TextGame from "../componentsTextGame/TextGame";
import styled from "styled-components";

const MainContainer = () => {

    const Main = styled.h2`
    text-align: center;
    `

return (
    <>
    <Main>I am the Main Container</Main>
    <TextGame></TextGame>
    </>
)
}
export default MainContainer
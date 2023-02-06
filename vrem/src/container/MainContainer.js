import { React, useState } from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";
import TextGame from "../componentsTextGame/TextGame";
import styled from "styled-components";

const MainContainer = () => {

    const PlaceHolderText = styled.h2`
    margin: 20px;
    padding: 20px;
    text-align: center;
    `

return (
    <>
    <Header />
    <PlaceHolderText I am the Main Container />
    <TextGame/>
    <Footer />
    </>
)
}
export default MainContainer
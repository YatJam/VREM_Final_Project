import React from 'react';
import { Link } from 'react-router-dom';
import styled from 'styled-components';

const UlWrapper = styled.ul`
    display: flex;
    flex-direction: row;
    justify-content: space-evenly;
    list-style-type: none;
    cursor: pointer;
    
    
`;

const Navigation = () => {
    return (
        <nav>
            <UlWrapper>
                <Link to='/about'>
                <li>About</li>
                </Link>
                <Link to='/characters'>
                <li>Characters</li>
               </Link>
               <Link to='/updates'>
                <li>Updates</li>
                </Link>
             </UlWrapper>
        </nav>
    );
};

export default Navigation;
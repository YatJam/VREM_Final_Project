import React from 'react';
import { Link } from 'react-router-dom';
import styled from 'styled-components';

const Nav = styled.nav`
    display: flex;
    flex-direction: row;
    justify-content: space-evenly;
`;

const Navigation = () => {
    return (
        <Nav>
            <ul>
                <Link to='/about'>
                <li>About</li>
                </Link>
                <Link to='/characters'>
                <li>Characters</li>
               </Link>
               <Link to='/updates'>
                <li>Updates</li>
                </Link>
             </ul>
        </Nav>
    );
};

export default Navigation;
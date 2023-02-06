import React from 'react';
import { Link } from 'react-router-dom';

const Header = () => {
    return (
        <header>
            <Link to='/'>
                <nav className='logo'>VREM</nav>
            </Link>{' '}
        </header>
    );
};

export default Header;


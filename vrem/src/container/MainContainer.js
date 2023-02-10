import { Routes, Route } from 'react-router-dom';
import HomeContainer from './HomeContainer';
import GameContainer from './GameContainer'
import About from '../components/componentsNavPages/About';
import Characters from '../components/componentsNavPages/Characters';
import Updates from '../components/componentsNavPages/Updates';
import { useLocation } from 'react-router-dom';
import { useEffect, useState } from 'react';
import CombatContainer from './CombatContainer';

const MainContainer = () => {
    const location = useLocation();
    const [displayLocation, setDisplayLocation] = useState(location);
    const [transitionStage, setTransitionStage] = useState('fadeIn');
    useEffect(() => {
        if (location !== displayLocation) setTransitionStage('fadeOut');
    }, [location, displayLocation]);

    return (
        <section
            className={`${transitionStage}`}
            onAnimationEnd={() => {
                if (transitionStage === 'fadeOut') {
                    setTransitionStage('fadeIn');
                    setDisplayLocation(location);
                }
            }}>
            <Routes location={displayLocation}>
                <Route path='/' element={<HomeContainer />} />
                <Route path='/about' element={<About /> } />
                <Route path='/characters' element={<Characters />} />
                <Route path='/updates' element={<Updates />} />
                <Route path='/game' element={<GameContainer />} />
                <Route path='/combat' element={<CombatContainer />} />
                {/* <Route path='/game' element={<GameContainer />} /> */}   
            </Routes>
        </section>
    );
};

export default MainContainer;
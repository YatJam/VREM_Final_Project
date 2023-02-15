import './App.css';
import Header from './components/Header';
import MainContainer from './container/MainContainer';
import { BrowserRouter } from 'react-router-dom';

function App() {
    return (
        <>
        <div className="rain">
          <BrowserRouter>
              <div className='App'>
                  <Header />
                  <MainContainer />
              </div>
          </BrowserRouter>
          </div>
        </>
    );
}

export default App;


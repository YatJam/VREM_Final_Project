import './App.css';
import Header from './components/Header';
import MainContainer from './container/MainContainer';
import { BrowserRouter } from 'react-router-dom';

function App() {
    return (
        <>
          <BrowserRouter>
              <div className='App'>
                  <Header />
                  <MainContainer />
              </div>
          </BrowserRouter>
        </>
    );
}

export default App;


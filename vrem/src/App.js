import './App.css';
import Header from './components/Header';
import MainContainer from './container/MainContainer';
import Footer from './components/Footer';
import { BrowserRouter } from 'react-router-dom';

function App() {
    return (
        <>
          <BrowserRouter>
              <div className='App'>
                  <Header />
                  <MainContainer />
                  <Footer />
              </div>
          </BrowserRouter>
        </>
    );
}

export default App;


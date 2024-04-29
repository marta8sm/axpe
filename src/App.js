import logo from './logo.svg';
import './App.css';
import ListadoPersonas from './componentes/ListadoPersonas';
import Header from './componentes/Header';
import Footer from './componentes/Footer';

function App() {
  return (
    <div className="App">
      <Header />
      <ListadoPersonas />
      <Footer />
    </div>
  );
}

export default App;

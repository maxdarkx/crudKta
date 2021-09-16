import React from 'react';
import StoreProvider from './components/StoreProvider';
import { Form } from './components/Form';
import List from './components/List';


function App() {
  return <StoreProvider>
    <h3>To-Do List</h3>
    <Form />
    <List />
  </StoreProvider>
}

export default App;
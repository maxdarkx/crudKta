import React from 'react';
import StoreProvider from './components/StoreProvider';
import { Form } from './components/Form';
import List from './components/List';


function App() {
  return <StoreProvider>
    <h3>To-Do List</h3>
    <div class="input-group mb-3">
      <Form />
    </div>
    <List />
  </StoreProvider>
}

export default App;
import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

import Label from './components/label/Label';
import Button from './components/button/Button';
import LinkButton from './components/button/LinkButton';


class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      message: 'Nenhuma mensagem ainda...',
    };
    this.onSaveClick = this.onSaveClick.bind(this);
    this.onEditClick = this.onEditClick.bind(this);
    this.onCancelClick = this.onCancelClick.bind(this);
    this.onOkClick = this.onOkClick.bind(this);
  }

  onSaveClick() {
    this.setState({
      message: 'O botão SALVAR foi clicado',
    });
  }

  onCancelClick() {
    this.setState({
      message: 'O botão CANCELAR foi clicado',
    });
  }

  onOkClick() {
    this.setState({
      message: 'O botão OK foi clicado',
    });
  }

  onEditClick() {
    this.setState({
      message: 'O botão EDITAR foi clicado',
    });
  }
  
  render() {
    return (
      <div className="App">
        <div className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <Label type="title">Bem vindo ao React</Label>
          <Label>
            Testando texto
          </Label>
        </div>
        <div>
          <Button.Save onClick={this.onSaveClick}></Button.Save>
          <br/>

          <Button.Cancel onClick={this.onCancelClick}></Button.Cancel>
          <br/>

          <Button.Ok onClick={this.onOkClick}></Button.Ok>
          <br/>

          <LinkButton type="danger" caption="Editar" onClick={this.onEditClick}></LinkButton>
          <Label>{this.state.message}</Label>

        </div>
      </div>
    );
  }
}

export default App;

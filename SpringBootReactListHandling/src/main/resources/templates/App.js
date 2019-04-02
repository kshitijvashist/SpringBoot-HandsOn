import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import Comp1 from './Component/comp1'



class App extends Component {
    
    
    constructor(props){
      super(props);
     
    }
  
   
    
    

    createFunc= ()=>
    {
      const data = [{sportsNo: "1",sportsName:"Football",sportslength:"12"},{sportsNo: "2",sportsName:"Basketball",sportslength:"6"}
      ,{sportsNo: "3",sportsName:"VolleyBall",sportslength:"7"},{sportsNo: "4",sportsName:"Cricket",sportslength:"11"}];
      alert("Do you want to call Api?, Press OK.")
      fetch('http://localhost:8080/getList', {
        method: 'post',
        mode: 'cors',
        body: JSON.stringify(data),
        headers: {
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin':'*',
            'Accept': 'application/json',
            'Origin': ''
        }
    }).then(res => {
      alert("Api Called Successfully.")
      res.text();
        return res;
    }).catch(err => alert(err));
    }
    render() {
     
      return (
        <div className="App"> 
      
      
          <input type="button" value="Call API" name="Call API" onClick={this.createFunc} />
        </div>
      );
     
     
    }
  }
  
  export default App;
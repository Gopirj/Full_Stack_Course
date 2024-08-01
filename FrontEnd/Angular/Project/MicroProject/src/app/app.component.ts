import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  // fname:string;
  // flag:true;
  // data:string[];
  // constructor(){
  //   this.fname="";
  //   this.flag=true;
  // }
  // save(){
  //   this.flag!=this.flag;
  // }
  fname:string;
  
  constructor(){
    this.fname="";
  }
}

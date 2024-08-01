import { Component } from '@angular/core';

@Component({
  selector: 'app-center',
  templateUrl: './center.component.html',
  styleUrl: './center.component.css'
})
export class CenterComponent {
  fname:string;
  
  constructor(){
    this.fname="";
  }
}

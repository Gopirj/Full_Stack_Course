import { Component } from '@angular/core';

@Component({
  selector: 'app-right',
  templateUrl: './right.component.html',
  styleUrl: './right.component.css'
})
export class RightComponent {
  fname:string;
  
  constructor(){
    this.fname="";
  }
}

import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  sum : number;
  sub : number;
  // constructor using to "private" method this move to data for "calc"
  constructor(private calc : CalculatorService){
    this.sum=calc.getAddtion(10,20);
    this.sub=calc.getSubtraction(10,20);
  }
}

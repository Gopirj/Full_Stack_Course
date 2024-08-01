import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent {
  sum : number;
  sub : number;
  fact : number;
  // constructor using to "private" method this move to data for "calc"
  constructor(private calc : CalculatorService){
    this.sum=calc.getAddtion(10,20);
    this.sub=calc.getSubtraction(10,20);
    this.fact=calc.getFactorial(5);
  }
}

import { Injectable } from '@angular/core';


@Injectable()
export class CalculatorService {
  getAddtion(a : number, b: number){
    return a+b;
  }
  
  getSubtraction(a :number, b : number){
    return a-b;
  }
  getFactorial(a:number){
    let n=1;
    for(let i=1;i<=a;i++){
      n=n*i;
    }
    return n;
  }
  
}

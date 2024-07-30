import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  fname:string;
  flag:boolean;
  vehicles:string[];
  selectedVehicle:string;
  myStyle:{};
  myClass:string;

  constructor(){
    this.fname="";
    this.flag = true;
    this.vehicles=["TwoWheeler","ThreeWheeler","FourWheeler"];
    this.selectedVehicle="";
    this.myStyle={'width':'40%','border':'2px solid green','border-radius':'25px','padding':'25px'};
    this.myClass="MyClass1";
  }
  changeFlag(){
    this.flag=!this.flag;
  }
  setSelectedItem(vec :string){
    this.selectedVehicle=vec;
  }
  changeStyle(){
    this.myStyle={'width':'40%','border':'2px solid red','border-radius':'25px','padding':'25px'};
  }
  }



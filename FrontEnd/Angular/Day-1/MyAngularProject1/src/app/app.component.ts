import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name:string;
  age : number;
  email : string;
  imagepath:string;
  
  constructor(){
    this.name = "gopi";
    this.age=20;
    this.email ="gopirj@gmail.com";
    this.imagepath="https://miro.medium.com/v2/resize:fit:1358/0*wuNf24urnMp7ypDp.png";
  }
  changName(){
    this.name="GOPI";
  }
  changImage(){
    this.imagepath="https://miro.medium.com/v2/resize:fit:1400/1*bMgQ8MhbnQexpqHgIgBJPA.png";
  }

}

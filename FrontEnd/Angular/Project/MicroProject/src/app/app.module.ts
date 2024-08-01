import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { TopComponent } from './top/top.component';
import { CenterComponent } from './center/center.component';
import { RightComponent } from './right/right.component';

@NgModule({
  declarations: [
    AppComponent,
    TopComponent,
    CenterComponent,
    RightComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { Component, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
// your using ROUTES declare to Routes
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CalculatorService } from './calculator.service';


// using for Routes for one link to another link move 
const ROUTES: Routes = [
  { path : 'home',component : HomeComponent},
  { path : 'contact',component : ContactComponent},
  { path : 'about',component : AboutComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    // RouterModule to imports the method 
    RouterModule.forRoot(ROUTES)
  ],
  providers: [
    CalculatorService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

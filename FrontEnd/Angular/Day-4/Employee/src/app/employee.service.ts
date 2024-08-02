import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  url:string;
  

  constructor(private http : HttpClient) { 
    this.url="http://localhost:3004/employee";
   

  }
  insertEmployee(employee:Employee){
    this.http.post<Employee>(this.url,employee).subscribe();
    return "Employee Details Added";
  }
}

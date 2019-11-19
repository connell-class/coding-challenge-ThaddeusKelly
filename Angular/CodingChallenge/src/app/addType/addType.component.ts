import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-addType',
  templateUrl: './addType.component.html',
  styleUrls: ['./addType.component.scss']
})
export class AddTypeComponent implements OnInit {

  constructor(private http:HttpClient) { }

  ngOnInit() {
  }
  submitForm(form:NgForm){
    this.http.post(`http://localhost:9001/CodingChallenge/type/save`, {
      name:form.value
    }).toPromise()
    .then((r:{name:string})=>{
      console.log(r);
    }).catch(e=>console.log(e));
  }

}

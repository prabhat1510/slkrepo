import { Component,OnInit,EventEmitter, Output } from '@angular/core';
import axios from "axios";

@Component({
  selector: 'app-customerlist',
  templateUrl: './customerlist.component.html',
  styleUrls: ['./customerlist.component.css']
})
export class CustomerlistComponent implements OnInit{
  data: any;
  @Output() dataFromChild = new EventEmitter<any>();

  constructor() {}

  ngOnInit(): void {
    this.getData();
  }
  getData(){
    const tokenStr=localStorage.getItem("accessToken");
   axios.get('http://localhost:8080/api/customer/customers',{ headers: {"Authorization" : `Bearer ${tokenStr}`} })
    .then((response)=> {
      this.data = response.data;
      this.dataFromChild.emit(this.data);
      console.log(this.data);
    })
    .catch((error)=> {
        console.log(error);
    });
   }
   //sendDataToParent() {
    //this.dataFromChild.emit(data);
  //}
}

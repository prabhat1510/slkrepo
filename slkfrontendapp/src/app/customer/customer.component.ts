import { Component,OnInit} from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import axios from "axios";
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit{
  customerForm !: FormGroup;

  constructor(private fb: FormBuilder,private router:Router) {
  }

  ngOnInit() {
    this.customerForm = this.fb.group({
      firstName: ['', [Validators.required, Validators.minLength(3)]],
      lastName: ['', [Validators.required, Validators.minLength(6)]],
      email: ['', [Validators.required, Validators.email]]
    });
   
  }
  async onSubmit(){
    if (this.customerForm.valid) {
      this.customerForm.value.customerId=0;
      console.log(this.customerForm.value);
      const tokenStr=localStorage.getItem("accessToken");

      await axios.post('http://localhost:8080/api/customer/new',this.customerForm.value,{ headers: {"Authorization" : `Bearer ${tokenStr}`} })
      .then(function (response) {
        console.log(response.data);
        })
      .catch(function (error) {
          console.log(error);
      });
      
    }
    this.router.navigate(["/custhome"]);
  }

}

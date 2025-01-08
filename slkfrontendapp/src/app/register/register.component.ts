import { Component,OnInit} from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import axios from "axios";
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit{
  registerForm !: FormGroup;
  //router:Router;
  constructor(private fb: FormBuilder,private router: Router) {
  }

  ngOnInit() {
    this.registerForm = this.fb.group({
      username: ['', [Validators.required, Validators.minLength(3)]],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]],
      mobile: ['', [Validators.required, Validators.minLength(10)]],
      address: ['', [Validators.required, Validators.minLength(1)]],
      gender: ['', [Validators.required, Validators.minLength(4)]],
    });
  }

  onSubmit() {
    if (this.registerForm.valid) {
      this.registerForm.value.role=null;
      console.log(this.registerForm.value);
      axios.post('http://localhost:8080/api/auth/signup',this.registerForm.value)
    .then(function (response) {
      console.log(response.data);
      alert(response.data);  
     })
    .catch(function (error) {
        console.log(error);
    });
    }
    this.router.navigate(["/login"]);
  
  }

}

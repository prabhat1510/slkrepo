import { Component,OnInit} from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import axios from "axios";
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
  loginForm !: FormGroup;

  constructor(private fb: FormBuilder,private router: Router) {
  }

  ngOnInit() {
    this.loginForm = this.fb.group({
      username: ['', [Validators.required, Validators.minLength(3)]],
      password: ['', [Validators.required, Validators.minLength(6)]]
    });
   
  }

  onSubmit() {
    if (this.loginForm.valid) {
      // Send login request to backend
      console.log(this.loginForm.value);
      axios.post('http://localhost:8080/api/auth/signin',this.loginForm.value)
    .then(function (response) {
      console.log(response.data.roles);
      localStorage.setItem("accessToken", response.data.accessToken);
      localStorage.setItem("roles",response.data.roles);
    })
    .catch(function (error) {
        console.log(error);
    });
    }
    //console.log(this.responseData);
    this.router.navigate(["/custhome"]);
  }
}
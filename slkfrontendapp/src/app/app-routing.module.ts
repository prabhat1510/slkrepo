import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {LoginComponent} from './login/login.component';
import {RegisterComponent} from './register/register.component';
import {GreetComponent} from './greet/greet.component';

const routes: Routes = [{ path: 'login', title: 'Login',component: LoginComponent },
  { path: 'register',title: 'Register', component: RegisterComponent },
  { path: '',title: 'Home',component: HomeComponent},
  { path: 'greet',title: 'Greet', component: GreetComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

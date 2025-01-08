import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {LoginComponent} from './login/login.component';
import {RegisterComponent} from './register/register.component';
import {GreetComponent} from './greet/greet.component';
import {LogoutComponent} from './logout/logout.component';

const routes: Routes = [{ path: 'login', title: 'Login',component: LoginComponent },
  { path: 'register',title: 'Register', component: RegisterComponent },
  { path: '',title: 'Home',component: HomeComponent},
  { path: 'greet',title: 'Greet', component: GreetComponent },
  { path: 'logout',title: 'Logout', component: LogoutComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

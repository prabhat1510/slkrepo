import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { GreetComponent } from './greet/greet.component';
import { LogoutComponent } from './logout/logout.component';
import { CustomerlistComponent } from './customerlist/customerlist.component';
import { CustomerdetailsComponent } from './customerdetails/customerdetails.component';
import { CustomerComponent } from './customer/customer.component';
import { CustomerhomeComponent } from './customerhome/customerhome.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    GreetComponent,
    LogoutComponent,
    CustomerlistComponent,
    CustomerdetailsComponent,
    CustomerComponent,
    CustomerhomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

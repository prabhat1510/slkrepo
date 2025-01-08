import { Component,OnInit} from '@angular/core';
import axios from "axios";

@Component({
  selector: 'app-greet',
  templateUrl: './greet.component.html',
  styleUrls: ['./greet.component.css']
})
export class GreetComponent implements OnInit{
  data: any;

  constructor() {}

  ngOnInit(): void {
    this.getData();
  }
  async getData() {
    try {
      const tokenStr=localStorage.getItem("accessToken");
      const response = await axios.get('http://localhost:8080/greet',{ headers: {"Authorization" : `Bearer ${tokenStr}`} });
      this.data = response.data;
      console.log(this.data);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  }
}

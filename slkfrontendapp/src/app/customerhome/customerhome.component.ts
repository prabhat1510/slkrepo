import { Component,OnInit} from '@angular/core';

@Component({
  selector: 'app-customerhome',
  templateUrl: './customerhome.component.html',
  styleUrls: ['./customerhome.component.css']
})
export class CustomerhomeComponent  implements OnInit{
  showComponent = false;

  ngOnInit(): void {
    setTimeout(() => {
      this.showComponent = true;
    }, 2000); // Delay rendering by 3 seconds
  }
}
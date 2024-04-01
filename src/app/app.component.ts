import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {TournoiComponent} from "./tournoi/tournoi.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, TournoiComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ping-pong-front';
}

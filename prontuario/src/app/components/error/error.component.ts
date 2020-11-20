import { MatIconModule, MatIconRegistry, MAT_ICON_LOCATION } from '@angular/material/icon';
import { Component, Inject } from "@angular/core";
import { MAT_DIALOG_DATA, MatDialog } from "@angular/material/dialog";
import { Subscription } from "rxjs";

@Component({
  templateUrl: "./error.component.html",
  selector: "app-error",
  styleUrls: ["./error.component.scss"]
})
export class ErrorComponent {
  constructor(@Inject(MAT_DIALOG_DATA) public data: { message: string, status: string, name: string }, public dialog: MatDialog) {}

  ngOnInit() {
  }

  refresh() {
    window.location.reload();
  }

  close() {
    this.dialog.closeAll()
  }
}

package model;

import java.time.LocalDate;

public class Task {
  private String title;
  private LocalDate alertDate;

  public Task(String givenTitle) {
    this.title = givenTitle;
  }

  public void setAlertDate(String givenAlertDate) {
    this.alertDate = LocalDate.parse(givenAlertDate);
  }

  public String getTitle() {
    return this.title;
  }

  public LocalDate getAlertDate() {
    return this.alertDate;
  }
}
